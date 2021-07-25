package by.academy.othertasks.task6;

public class Student {

    public static final int MAX_AVARAGE_MARK = 5;
    public static final int FIRST_STEPENDY_SUM = 100;
    public static final int SECOND_STEPENDY_SUM = 80;
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setgroup(String group) {
        this.group = group;
    }

    public String getgroup() {
        return group;
    }

    public void setaverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getaverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        if (averageMark == MAX_AVARAGE_MARK) {
            return FIRST_STEPENDY_SUM;
        } else {
            return SECOND_STEPENDY_SUM;
        }
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
        Student student = (Student) o;
        return firstName != null ? firstName.equals(student.firstName) : student.firstName == null
                && lastName != null ? lastName.equals(student.lastName) : student.lastName == null
                && group != null ? group.equals(student.group) : student.group == null
                && averageMark == student.averageMark;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += result * prime + (firstName != null ? firstName.hashCode() : 0);
        result += result * prime + (lastName != null ? lastName.hashCode() : 0);
        result += result * prime + (group != null ? group.hashCode() : 0);
        result += result * prime + averageMark;
        return result;
    }
}
