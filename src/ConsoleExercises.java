import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of %f is approximately 3.14.\n", pi);

        // Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//        System.out.println("Enter an integer please: ");
        Scanner userInput = new Scanner(System.in);
//        int userNum = userInput.nextInt();
//        System.out.println("You entered: " + userNum);
        //What happens if you input something that is not an integer?
        // An exception is thrown because it's an invalid data type

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        String first;
//        String second;
//        String third;
//        System.out.println("Enter 3 words please: ");
//        first = userInput.next();
//        second = userInput.next();
//        third = userInput.next();
//        System.out.println("First word: " + first);
//        System.out.println("Second word: " + second);
//        System.out.println("Third word: " + third);

        /* What happens if you enter less than 3 words?
        * It waits for a third word
        *
        * What happens if you enter more than 3 words?
        * It only prints the first three words
        */

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.println("Enter a sentence please: ");
//        String sentence = userInput.nextLine();
//        System.out.println("You entered: " + sentence);
        // do you capture all the words?
        // No, because next() only captures up to a whitespace. nextLine() is preferred to capture a sentence.

        // Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
        System.out.println("Enter values for the length and width(respectively) of the classroom you're in: ");
//        userInput = userInput.useDelimiter("\n");
        double length = Double.parseDouble(userInput.next());
        double width = Double.parseDouble(userInput.next());
        System.out.printf("Length: " + length + "%nWidth: " + width + "%n");

        // Display the area and perimeter of that classroom.
        //
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        System.out.println("Area : " + (length * width));
        System.out.println("Perimeter : " + ((2 * length)+(2 * width)));

    }
}
