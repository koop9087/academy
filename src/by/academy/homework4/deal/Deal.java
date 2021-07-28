package by.academy.homework4.deal;

import java.util.*;

public class Deal {
    public static final Calendar CALENDAR = Calendar.getInstance();
    public static final Scanner SCANNER = new Scanner(System.in);
    private Product[] products;
    private User seller;
    private User buyer;
    private Date dealDate;
    private Date deadLineDate;

    public Deal(Product[] products, User user, User buyer, Date dealDate, Date deadLineDate) {
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
            for (Product p : products) {
                fullPrice += p.calcPrice();
            }
        }
        return fullPrice;
    }

    public void menu(List<Product> list) {                                        //task6
        int count = 0;
        while (count < products.length) {
            System.out.println("Введите цифру 1 для удаления продукта, 2 для добавления, 3 для выхода с меню");
            switch (SCANNER.nextLine()) {
                case "1":
                    switch (SCANNER.nextLine()) {
                        case "NA4OSBURGER":
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals("NA4OSBURGER")) {
                                    list.remove(i);
                                    break;
                                }
                            }
                            break;
                        case "САХАР-ПРО":
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals("САХАР-ПРО")) {
                                    list.remove(i);
                                    break;
                                }
                            }
                            break;
                        case "Газированная":
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals("Газированная")) {
                                    list.remove(i);
                                    break;
                                }
                            }
                            break;
                    }
                    break;

                case "2":
                    System.out.println("Введите тип нового продукта. Доступные сейчас Burger Sugar Water");
                    switch (SCANNER.nextLine()) {
                        case "Burger":
                            System.out.println("Сейчас в магазине проблемы, поэтому название будет соответствовать тому, что вы ввели ранее");
                            System.out.println("___________________________________________");
                            System.out.println("Введите цену, количество");
                            list.add(count, new Burger(SCANNER.nextDouble(), SCANNER.nextInt(), "Burger"));
                            count++;
                            break;
                        case "Water":
                            list.add(count, new Water(SCANNER.nextDouble(), SCANNER.nextInt(), "Water"));
                            count++;
                            calcFullPrice();
                            break;
                        case "Sugar":
                            list.add(count, new Sugar(SCANNER.nextDouble(), SCANNER.nextInt(), "Sugar"));
                            count++;
                            break;
                    }
                    break;
                case "3":
                    return;
                default:

            }
        }
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(products, deal.products)) return false;
        if (seller != null ? !seller.equals(deal.seller) : deal.seller != null) return false;
        if (buyer != null ? !buyer.equals(deal.buyer) : deal.buyer != null) return false;
        if (dealDate != null ? !dealDate.equals(deal.dealDate) : deal.dealDate != null) return false;
        return deadLineDate != null ? deadLineDate.equals(deal.deadLineDate) : deal.deadLineDate == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(products);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        result = 31 * result + (deadLineDate != null ? deadLineDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deal{");
        sb.append("products=").append(Arrays.toString(products));
        sb.append(", seller=").append(seller);
        sb.append(", buyer=").append(buyer);
        sb.append(", dealDate=").append(dealDate);
        sb.append(", deadLineDate=").append(deadLineDate);
        sb.append('}');
        return sb.toString();
    }
}