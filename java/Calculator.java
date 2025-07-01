import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        System.out.println("Addition: "+ add(a, b));
        System.out.println("Subtraction: "+ subtract(a, b));
        System.out.println("Multiplication: "+ multiply(a, b));
        System.out.println("Division: "+ divide(a, b));
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name");
        //String input = sc.nextLine();
        //System.out.println(input);
    }
    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y){
        return x - y;
    }

    static int multiply(int x, int y){
        return x * y;
    }

    static int divide(int x, int y){
        if( y == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return x/y;
    }

    
}