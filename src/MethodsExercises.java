public class MethodsExercises {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        addition(x, y);
        subtraction(x,y);
        System.out.println(x + " * " + y + " = " + multiplication(x, y));
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

    public static Integer multiplication(int x, int y) {
        int result = 0;
        if(y <= 0){
            return 0;
        }else {
            result = x + multiplication(x, y - 1);
        }
        return result;

//        int result = 0;
//        for(int i = 1; i <= y; i++){
//           result += x;
//        }
//        System.out.println(x + " * " + y + " = " + (result));
//        return result;

    }

    public static Integer division(int x, int y){
        try {
            System.out.println(x + " / " + y + " = " + (x / y));
            return x / y;
        }catch(Exception e){
            System.out.println("Can't divide by 0 for the division equation.");
        }
        return 0;
    }

    public static Integer modulus(int x, int y){
        try {
            System.out.println(x + " % " + y + " = " + (x % y));
            return x % y;
        }catch(Exception e){
            System.out.println("Can't divide by 0 for the modulus equation.");
        }
        return 0;
    }
}
