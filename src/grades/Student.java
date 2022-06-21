package grades;

import java.util.ArrayList;

public class Student {
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    };

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(ArrayList<Integer> grades){
        double average = 0;
        for(double grade : grades){
            average += grade;
        }
        average = average / grades.size();
        return average;
    };

    private String name;
    private ArrayList<Integer> grades;
}
