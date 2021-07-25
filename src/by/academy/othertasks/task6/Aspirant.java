package by.academy.othertasks.task6;

public class Aspirant extends Student {
    public static final int FIRST_STEPENDY_SUM = 200;
    public static final int SECOND_STEPENDY_SUM = 180;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    @Override
    public double getScholarship() {
        if(getaverageMark() == MAX_AVARAGE_MARK) {
            return FIRST_STEPENDY_SUM;
        } else {
            return SECOND_STEPENDY_SUM;
        }
    }
}
