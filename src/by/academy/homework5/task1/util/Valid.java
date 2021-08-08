package by.academy.homework5.task1.util;

public class Valid implements Validator {
    public static final String FIRST_FORMAT_VALID = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)$";
    private String line;

    public Valid(String line) {
        this.line = line;
    }

    @Override
    public boolean validate() {
        return line.matches(FIRST_FORMAT_VALID);
    }
}
