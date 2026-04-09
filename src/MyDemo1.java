import java.util.Scanner;
public class MyDemo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter you name: ");
        name = scanner.nextLine();
        System.out.print("Enter you age: ");
        age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Name is "+name + " and age is "+age);
        }
        else System.out.println("Not eligible to continue");
    }
}
