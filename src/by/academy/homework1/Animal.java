package by.academy.homework1;

public class Animal {
    int age;
    String nickName;

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName(String nickName) {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Animal() {
        this.age = 20;
        this.nickName = "littleTurtle";
    }

    public Animal(int age, String nickName) {
        this.age = age;
        this.nickName = nickName;
    }
}

