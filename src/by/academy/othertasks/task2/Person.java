package by.academy.othertasks.task2;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        super();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println(getFullName() + "Говорит ");
    }

    public void move() {
        System.out.println(getFullName() + "Идет ");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null
                && age == person.age;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += result * prime + (fullName != null ? fullName.hashCode() : 0);
        result += result * prime + age;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person {");
        sb.append("fullName :").append(fullName);
        sb.append("age :").append(age);
        return sb.toString();
    }
}
