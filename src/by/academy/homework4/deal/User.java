package by.academy.homework4.deal;

import java.util.regex.Pattern;

public class User {
    private String name;
    private double money;
    private String dateOfBirth;
    private String phone;
    private String email;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public User(String name, double money, String dateOfBirth) {
        this.name = name;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String name, double money, String dateOfBirth, String phone, String email) {
        this.name = name;
        this.money = money;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isDateOfBirthIsValid(String dateOfBirth) {
        boolean valid = false;
        if (Pattern.matches(Valid.SECOND_FORMAT_VALID, dateOfBirth)
                || Pattern.matches(Valid.FIRST_FORMAT_VALID, dateOfBirth)) {
            valid = true;
        }
        return valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (Double.compare(user.money, money) != 0) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(user.dateOfBirth) : user.dateOfBirth != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append(", dateOfBirth='").append(dateOfBirth).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}