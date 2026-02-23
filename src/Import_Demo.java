import java.util.Scanner;
public class Import_Demo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Enter you first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter you second integer: ");
        num2 = input.nextInt();

        sum = (num1 + num2);

        System.out.println("Sum of " +num1+ " and " +num2+ " is " +sum);

    }

}
