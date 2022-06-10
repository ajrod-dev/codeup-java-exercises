public class MethodsExercises {
    public static void main(String[] args) {
        int x = 20;
        int y = 3;
        addition(x, y);
        subtraction(x,y);
        multiplication(x,y);
        division(x, y);
        modulus(x, y);

    }

    public static Integer addition(int x, int y){
        System.out.println(x + " + " + y + " = " + (x + y));
        return x + y;
    }

    public static Integer subtraction(int x, int y){
        System.out.println(x + " - " + y + " = " + (x - y));
        return x - y;
    }

    public static Integer multiplication(int x, int y){
        System.out.println(x + " * " + y + " = " + (x * y));
        return x * y;
    }

    public static Integer division(int x, int y){
        if(y == 0){
            System.out.println("Can't divide by 0");
            return 0;
        }else{
            System.out.println(x + " / " + y + " = " + (x / y));
            return x / y;
        }
    }

    public static Integer modulus(int x, int y){
        if(y == 0){
            System.out.println("Can't divide by 0");
            return 0;
        }else{
            System.out.println(x + " % " + y + " = " + (x % y));
            return x % y;
        }
    }
}
