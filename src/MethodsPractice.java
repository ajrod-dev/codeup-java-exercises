import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The difference between these two ints is: " + getDifference(a,b));
    }
    public static int getDifference(int a, int b){
        return a - b;
    }
}
