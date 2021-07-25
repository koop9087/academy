package by.academy.homework4.deal;

public class Main {
    public static void main(String[] args) {
        Deal deal = new Deal();
        User saller = new User("Jeka", 200);
        User buyer = new User("Jarik", 100);
        Product[] products = new Product[3];
        products[0] = new Burger("Из БК", 150, "NA4OSBURGER", 7, 1);
        products[1] = new Sugar("Из Евроопта", 1000, "САХАР-ПРО", 1.45, 3);
        products[2] = new Water("Из Green", 1.4, 1,"Газированная",2);

        for(Product elm : products){
            System.out.println(deal.calcFullPrice(products));
        }

    }
}
