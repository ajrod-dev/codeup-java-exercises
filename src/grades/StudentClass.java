package grades;

public class StudentClass {
    public static void main(String[] args) {
        Student alex = new Student("Alex");
        alex.addGrade(89);
        alex.addGrade(80);
        alex.addGrade(90);
        System.out.println(alex.getName());
        System.out.println(alex.getGrades());
        System.out.printf("%.2f%n", alex.getGradeAverage(alex.getGrades()));

        Student john = new Student("John");
        john.addGrade(92);
        john.addGrade(80);
        john.addGrade(90);
        System.out.println(john.getName());
        System.out.println(john.getGrades());
        System.out.printf("%.2f%n", john.getGradeAverage(john.getGrades()));





    }
}
