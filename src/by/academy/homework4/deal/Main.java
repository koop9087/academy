package by.academy.homework4.deal;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        String line = Valid.scanLine();                                 //task 3
        Valid validTest = new Valid();                                  //task 3
        validTest.isValid(line);                                        //task 3
        validTest.isValidForSecondFormat(line);                        //task 3
        ReformationLineWithSimpleDateFormat.reformatLine();             //task4
        System.out.println();                                            //ввод для 5ого задания со строки от 4ого задания (для удобства сделан пустой систем аут)
        Scanner scanner = new Scanner(System.in);                        // task5
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
        int sizeOfArray = 3;                                            //classwork
        Deal deal = new Deal();
        User seller = new User("Jeka", 200);
        User buyer = new User("Jarik", 100);
        Product[] products = new Product[sizeOfArray];
        products[0] = new Burger("Из БК", 90, "NA4OSBURGER", 100, 1);
        products[1] = new Sugar("Из Евроопта", 1000, "САХАР-ПРО", 800, 3);
        products[2] = new Water("Газированная", 140, 1, "Из Грина", 7);          //classwork
        deal.setBuyer(buyer);
        deal.setSeller(seller);
        deal.setProducts(products);
        deal.menu();
        for (Product elms : products) {
            System.out.println(elms);
        }
        products = deal.getProducts();
        changeOurProducts(deal, products);
        System.out.println(deal.getDeadLineDate());                                                  // task7
        String userDateOfBirthIsValid = Valid.scanLine();                                            //task8
        User user = new User("Kirill", 900, userDateOfBirthIsValid);                    //task8
        System.out.println(user.isDateOfBirthIsValid(userDateOfBirthIsValid));                       //task8
        User lena = new User("Lena", 200, "08/10/2001", "+375292871211", "lena9010@gmail.com"); //task9
        System.out.println(belarusPhoneValidator.validate(lena.getPhone()));
        System.out.println(emailValidator.validate(lena.getEmail()));

    }

    private static void changeOurProducts(Deal deal, Product[] newProducts) {
        deal.setProducts(newProducts);
        System.out.println("Чек :");
        for (int i = 0; i < deal.getActualSize(); i++) {
            System.out.println(newProducts[i].getName() + " price: " + newProducts[i].calcPrice());
        }
        System.out.println("");
        System.out.println("Full price: " + deal.calcFullPrice());
    }
}
