package by.academy.homework4.deal;

import java.util.*;

public class Deal {
    public static final Calendar CALENDAR = Calendar.getInstance();
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String TYPE_NACHOSBURGER = "Бургер";
    public static final String TYPE_SUGAR_PRO = "Сахарок";
    public static final String TYPE_SODA_WATER = "Водичка";
    public static final String MENU_MESSAGE = "Введите цифру 1 для удаления продукта, 2 для добавления, остальные цифры для выхода из меню";
    public static final String BURGER = "Burger";
    public static final String WATER = "Water";
    public static final String SUGAR = "Sugar";
    public static final String ALLOWED_PRODUCTS_MESSAGE = "Введите тип нового продукта. Доступные сейчас Burger Sugar Water";
    public static final String INPUT_PRICE_QUANTITY_MESSAGE = "Введите цену, количество";
    private int actualSize;
    private ArrayList<Product> products;
    private User seller;
    private User buyer;
    private Date dealDate;
    private Date deadLineDate;


    public Deal(ArrayList<Product> products, User user, User buyer, Date dealDate, Date deadLineDate) {
        this.actualSize = products.size();
        this.products = products;
        this.seller = user;
        this.buyer = buyer;
        this.dealDate = dealDate;
        this.deadLineDate = deadLineDate;
    }

    public Deal() {
        super();
    }

    public double calcFullPrice() {
        double fullPrice = 0;
        if (products != null) {
            for (int i = 0; i < products.size(); i++) {
                fullPrice += products.get(i).calcPrice();
            }
        }
        return fullPrice;
    }

    public void menu() {                                                //task6
        while (true) {
            System.out.println(MENU_MESSAGE);
            switch (SCANNER.nextLine()) {
                case "1":
                    switch (SCANNER.nextLine()) {
                        case TYPE_NACHOSBURGER:
                            deleteElement(TYPE_NACHOSBURGER);
                            break;
                        case TYPE_SUGAR_PRO:
                            deleteElement(TYPE_SUGAR_PRO);
                            break;
                        case TYPE_SODA_WATER:
                            deleteElement(TYPE_SODA_WATER);
                            break;
                    }
                    break;

                case "2":
                    System.out.println(ALLOWED_PRODUCTS_MESSAGE);
                    switch (SCANNER.nextLine()) {
                        case BURGER:
                            System.out.println(INPUT_PRICE_QUANTITY_MESSAGE);
                            addElement(new Burger(SCANNER.nextDouble(), SCANNER.nextInt(), BURGER));
                            calcFullPrice();
                            SCANNER.nextLine();
                            break;
                        case WATER:
                            addElement(new Water(SCANNER.nextDouble(), SCANNER.nextInt(), WATER));
                            calcFullPrice();
                            SCANNER.nextLine();
                            break;
                        case SUGAR:
                            addElement(new Sugar(SCANNER.nextDouble(), SCANNER.nextInt(), SUGAR));
                            calcFullPrice();
                            SCANNER.nextLine();
                            break;
                    }
                    break;
                default:
                    return;

            }
        }
    }

    public void addElement(Product product) {
        products.add(product);
    }

    public void deleteElement(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
            }
        }
    }

    public void printSort() {
        sort(products);
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }

    public void sort(ArrayList<Product> products) {             // По убыванию
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < products.size(); j++) {
                if (compareObj(products.get(i), products.get(j)) > 0) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private int compareObj(Product firstProduct, Product secondProduct) {
        Comparator comparator = Comparator.naturalOrder();
        return comparator.compare(findLetter(firstProduct), findLetter(secondProduct));
    }

    private int findLetter(Product product) {
        String rusLetters = "АБВГДЕЁЗЖИЁКЛМНОПРСТУФХЦЧШЩЬЭЪЭЮЯ";
        String[] str = rusLetters.split("");
//        char[] chars = rusLetters.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (product.getName().charAt(0) == str[i].charAt(0)) {
                return i;
            }
        }
        return 0;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Date getDealDate() {                       //task7 наша дата + 10 дней (автоматически)
        CALENDAR.setTime(dealDate = new Date());
        CALENDAR.add(Calendar.DATE, 10);
        dealDate = CALENDAR.getTime();
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Date getDeadLineDate() {
        CALENDAR.setTime(deadLineDate = new Date());
        CALENDAR.add(Calendar.DATE, 10);
        deadLineDate = CALENDAR.getTime();
        return deadLineDate;
    }

    public void setDeadLineDate(Date deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    public int getActualSize() {
        return actualSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        if (actualSize != deal.actualSize) return false;
        if (products != null ? !products.equals(deal.products) : deal.products != null) return false;
        if (seller != null ? !seller.equals(deal.seller) : deal.seller != null) return false;
        if (buyer != null ? !buyer.equals(deal.buyer) : deal.buyer != null) return false;
        if (dealDate != null ? !dealDate.equals(deal.dealDate) : deal.dealDate != null) return false;
        return deadLineDate != null ? deadLineDate.equals(deal.deadLineDate) : deal.deadLineDate == null;
    }

    @Override
    public int hashCode() {
        int result = actualSize;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        result = 31 * result + (deadLineDate != null ? deadLineDate.hashCode() : 0);
        return result;
    }
}