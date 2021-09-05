package by.academy.homework8.task2.service;

import by.academy.homework8.task2.entity.Person;
import by.academy.homework8.task2.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionService {
    Person person = new Person("Ivan", "Sidorov", 20, "20.10.2010");
    User user = new User("ivan5090", "is2130", "ivan@mgmail.com");
    Class<? extends Person> personClass = Person.class;
    Class<? extends User> userClass = User.class;
    Method[] getMethods;
    Field[] getFields;

    public void printAllReflectMethods() {
        try {
            System.out.println(getMethods = personClass.getMethods());
            System.out.println(getMethods = userClass.getMethods());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printReflectMethod() {
        try {
            System.out.println(personClass.getMethod("getLastName"));
            System.out.println(userClass.getMethod("getLogin"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void printAllReflectFields() {
        System.out.println(getFields = personClass.getFields());
        System.out.println(getFields = userClass.getFields());
    }

    public void printReflectField() {
        try {
            System.out.println(personClass.getField("firstName"));
            System.out.println(userClass.getField("password"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void printAllReflectDeclaredMethods() {
        getMethods = personClass.getDeclaredMethods();
        for (Method method : getMethods) {
            System.out.println(method);
        }
        getMethods = userClass.getDeclaredMethods();
        for (Method method : getMethods) {
            System.out.println(method);
        }
    }

    public void printReflectDeclaredMethods() {
        try {
            System.out.println(personClass.getDeclaredMethod("hashCode"));
            System.out.println(userClass.getDeclaredMethod("hashCode"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void printAllReflectDeclaredFields() {
        getFields = personClass.getDeclaredFields();
        customForeach();
        getFields = userClass.getDeclaredFields();
        customForeach();
    }

    public void printReflectDeclaredFields() {
        try {
            System.out.println(personClass.getDeclaredField("dateOfBirth"));
            System.out.println(userClass.getDeclaredField("login"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void printPersonClassFields() {
        customAccessible(personClass, person, "firstName", "Sergei");
    }

    public void printUserClassFields() {
        customAccessible(userClass, user, "login", "sergein@mail.ru");
    }

    public void printInvokeToString() {
        Person person = new Person();
        try {
            Method personToString = personClass.getDeclaredMethod("toString");
            personToString.invoke(person);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void customForeach() {
        for (Field field : getFields) {
            System.out.println(field);
        }
    }

    private void customAccessible(Class<?> clz, Object o, String name, String newName) {
        try {
            Field field = clz.getDeclaredField(name);
            field.setAccessible(true);
            field.set(o, newName);
            System.out.println(field.get(o));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
