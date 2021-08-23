package by.academy.homework4.deal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line = Valid.scanLine();
        Valid validTest = new Valid();
        validTest.isValid(line);
        validTest.isValidForSecondFormat(line);
        try{
            ReformationLineWithSimpleDateFormat.reformatLine();

        } catch (CustomParseException e){
            System.out.println("Ввод неверный");
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String americanPhone = scanner.nextLine();
        String belarusianPhone = scanner.nextLine();
        String email = scanner.nextLine();
        AmericanPhoneValidator americanPhoneValidator = new AmericanPhoneValidator();
        System.out.println(americanPhoneValidator.validate(americanPhone));
        BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
        System.out.println(belarusPhoneValidator.validate(belarusianPhone));
        Validator emailValidator = new Validator() {
            @Override
            public boolean validate(String email) {
                return email.matches("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})");
            }
        };
        System.out.println(emailValidator.validate(email));                  // task5
        Deal deal = new Deal();
        User seller = new User("Jeka", 200);
        User buyer = new User("Jarik", 100);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Burger("Из БК", 90, "Бургер", 100, 1));
        products.add(new Sugar("Из Евроопта", 1000, "Сахарок", 800, 3));
        products.add(new Water("Водичка", 140, 1, "Из Грина", 7));
        deal.setBuyer(buyer);
        deal.setSeller(seller);
        deal.setProducts(products);
        //deal.menu();
        for (Product elms : products) {
            System.out.println(elms);
        }
        products = deal.getProducts();
        printCheck(deal, products);
        printReverseCheck(deal, products);
        System.out.println(deal.getDeadLineDate());                                                                                   // task7
        String userDateOfBirthIsValid = Valid.scanLine();                                                                             //task8
        User user = new User("Kirill", 900, userDateOfBirthIsValid);                                                    //task8
        System.out.println(user.isDateOfBirthIsValid(userDateOfBirthIsValid));                                                      //task8
        User lena = new User("Lena", 200, "08/10/2001", "+375292871211", "lena9010@gmail.com"); //task9
        System.out.println(belarusPhoneValidator.validate(lena.getPhone()));
        System.out.println(emailValidator.validate(lena.getEmail()));
        deal.printSort();
    }

    private static void printCheck(Deal deal, ArrayList<Product> newProducts) {                                             //Вывод продуктов в правильном порядке (homework 3)
        deal.setProducts(newProducts);
        System.out.println("Чек :");
        for (int i = 0; i < newProducts.size(); i++) {
            System.out.println(newProducts.get(i).getName() + " price: " + newProducts.get(i).calcPrice());
        }
        System.out.println("");
        System.out.println("Full price: " + deal.calcFullPrice());
    }

    private static void printReverseCheck(Deal deal, ArrayList<Product> newProducts) {                                      //Вывод продуктов в обратном порядке (homework 6 или 7)
        deal.setProducts(newProducts);
        System.out.println("Чек :");
        for (int i = newProducts.size() - 1; i > -1; i--) {
            System.out.println(newProducts.get(i).getName() + " price: " + newProducts.get(i).calcPrice());
        }
        System.out.println("");
        System.out.println("Full price: " + deal.calcFullPrice());
    }
}
