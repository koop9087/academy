package by.academy.othertasks.task6;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant("Ivan", "Ivanovich", "Politehnicheskaya", 6.1);
        Student[] students = new Student[3];
        students[0] = new Aspirant("Алеша", "Сидоров", "Economics", 5);
        students[1] = new Aspirant("Ваня", "Попович", "Laws", 2.4);
        students[2] = new Student("Гриша", "Смолин", "Biologic", 3);
        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
    }
}
