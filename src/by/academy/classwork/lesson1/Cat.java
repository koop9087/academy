package by.academy.classwork.lesson1;

public class Cat {
    private int age = 10;
    private String nickName = "Ярик";
    private int money;
    private char initials;
    private boolean isHomeAnimal;

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println("Ярик спит");
    }

    public void eat() {
        System.out.println("Ярик ест");
    }

    public void walk() {
        System.out.println("Ярик гуляет");
    }

    public Cat() {
    }

    public Cat(String nickName) {
        this.nickName = nickName;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public int getInitials() {
        return initials;
    }

    public void setIsHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }

    public boolean getIsHomeAnimal() {
        return isHomeAnimal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
