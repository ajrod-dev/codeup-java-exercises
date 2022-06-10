import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//
//        }

        // Do While
//        1.)

//        int i = 0;
//        do {
//        i += 2;
//            System.out.println(i);
//        }while(i < 100);
//          2.)

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//          3.)
//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int)Math.pow(i,2);
//        } while(i < 1000000);

        // For Loops
        // 1.)
//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
       
//      2.)
//        for(int i = 2; i < 1000000; i = (int)Math.pow(i,2)){
//            System.out.println(i);
//        }

        // FizzBuzz
//        for(int i = 1; i<=100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }

        // Table of Powers
        Scanner sc = new Scanner(System.in);
        System.out.println("What integer would you like to go up to? ");
        int input = sc.nextInt();
        System.out.println("Here is your table: ");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        int start = 1;
        while(start <= input){
            System.out.println(start + "\t   | " + (int)Math.pow(start, 2) + "\t\t | " + (int)Math.pow(start, 3));
            start++;
        }


    }

    }


