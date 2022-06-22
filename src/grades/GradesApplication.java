package grades;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Student> students = new HashMap<>();

        Student alex = new Student("Alex");
        alex.addGrade(80);
        alex.addGrade(85);
        alex.addGrade(90);

        Student sammy = new Student("Sammy");
        sammy.addGrade(70);
        sammy.addGrade(75);
        sammy.addGrade(80);

        Student johnny = new Student("Johnny");
        johnny.addGrade(70);
        johnny.addGrade(85);
        johnny.addGrade(90);

        Student billy = new Student("Billy");
        billy.addGrade(80);
        billy.addGrade(85);
        billy.addGrade(95);

        students.put("arod", alex);
        students.put("sammy-sosa", sammy);
        students.put("johnny_mize-bball", johnny);
        students.put("billy-beane", billy);


        // START
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        for(Map.Entry<String, Student> set : students.entrySet()){
            System.out.printf("|" + set.getKey() + "|\t");
        }

        boolean quit = false;
        START:
        do {
            System.out.println("\nWhat student would you like to see more information on?\n");
            String input = sc.next();
            if(!students.containsKey(input)){
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
                System.out.println("Would you like to see another student?\n");
                input = sc.next();
                if(input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")){
                    quit = true;
                }else{
                    break START;
                }
            }else {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.1f", students.get(input).getName(), input, students.get(input).getGradeAverage(students.get(input).getGrades()));
                System.out.println("\nWould you like to see another student?\n");
                input = sc.next();
                if(input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                    System.out.println("\nGoodbye, and have a wonderful day!\n");
                    quit = true;
                }
            }
        }while(!quit);

    }
}
