package util;
import java.util.Scanner;


public class InputTest {
    public static void main(String[] args) {

    Input in = new Input();

        System.out.println(in.getString());
        System.out.println(in.yesNo());
        System.out.println(in.getInt(1,10));
        System.out.println(in.getInt());
        System.out.println(in.getDouble(1,10));
        System.out.println(in.getDouble());




    }
}
