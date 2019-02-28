import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
do {
    System.out.println("what operation?");
    String operation = input.next();

    System.out.println("whats the first number?");
    double f1st = input.nextDouble();

    System.out.println("whats the second number?");
    double s2nd = input.nextDouble();

    double Result = 0;
    if (operation.equals("+")) {
        Result = f1st + s2nd;
    } else if (operation.equals("-")) {
        Result = f1st - s2nd;
    } else if (operation.equals("*")) {
        Result = f1st * s2nd;
    } else if (operation.equals("/")) {
        Result = f1st / s2nd;
    } else {
        Result = 0;
        System.out.println("illegal operation");
    }
    System.out.println("the result is ...");
    System.out.println(Result);
}while(true);
    }
}