package by.academy.classwork.lesson1;

public class Application {
    public static void main(String[] args) {
        Cat ordinaryCat = new Cat();
        Cat extraordinaryCat = new Cat("Индекс");
        extraordinaryCat.eat();
        extraordinaryCat.sleep();
        extraordinaryCat.walk();
        ordinaryCat.grow();
        ordinaryCat.grow();
        ordinaryCat.grow();
        System.out.println(ordinaryCat.getAge());
    }
}
