import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String messageToBob;
        String response;
        System.out.println("I'm introducing you to Bob. \n Bob meet Alex, Alex meet Bob.\n Speak to Bob with whatever you'd like to discuss.\n");
        do {
            speakingWithBob();
            System.out.println("Do you wish to continue speaking with Bob?");
            response = input.next();
        }while(!response.equals("no"));
        System.out.println("Have a good day! Hope you enjoyed Bob's company.");

    }


    public static void speakingWithBob(){
        Scanner input = new Scanner(System.in);
        String messageToBob;
        int count = 5;
        do {
            messageToBob = input.nextLine();
            if (messageToBob.endsWith("?")) {
                System.out.println("Sure.");
            } else if (messageToBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (messageToBob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            count--;
        } while (count > 0);

    }
}
