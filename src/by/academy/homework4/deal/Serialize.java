package by.academy.homework4.deal;

import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        User user = new User("L",100);
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\io\\file.txt"));){
            ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream);
            osu.writeObject(user);
        } catch (IOException e){
            System.out.println("exce");
        }
        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src\\io\\text.txt"))){
            ObjectInputStream isu = new ObjectInputStream(br);
            User user1 = (User) isu.readObject();
            System.out.println(user1);
        } catch (IOException | ClassNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}