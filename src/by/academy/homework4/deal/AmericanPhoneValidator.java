package by.academy.homework4.deal;

public class AmericanPhoneValidator implements Validator {

    @Override
    public boolean validate(String line) {
        return line.matches("[+][1]\\d{10}");
    }
}
