package by.academy.othertasks.task1;

public class Main {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("Samsung", 2214054, 100);
        Phone secondPhone = new Phone(9891209, "iPhone");
        Phone thirdPhone = new Phone();
        System.out.println(firstPhone);
        System.out.println(secondPhone);
        System.out.println(thirdPhone);
        firstPhone.receiveCall("Jeka");
        secondPhone.receiveCall("Yarik");
        thirdPhone.receiveCall("Oleg");
        firstPhone.receiveCall("Jarik ", 666);
        firstPhone.sendMessage("Kirill ", 2009012, "Hello world ");
    }
}
