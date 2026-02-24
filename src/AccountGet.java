import java.util.Scanner;

public class AccountGet{

  public static void main(String[] args){
    //instantiate the scanner object
Scanner scanner = new Scanner(System.in);
//declare the variables
String name, surname;
double amount;

System.out.print("Enter name: ");
  name = scanner.next();
System.out.print("Enter surname: ");
  surname = scanner.next();
System.out.print("Enter balance: ");
  amount = scanner.nextDouble();
    
Account myAcc = new Account(name, surname, amount);
    System.out.println("Account Details");
    System.out.println("Name: " +myAcc.getName());
    System.out.println("Surname: " +myAcc.getSurname());
    System.out.println("Balance: " +myAcc.getBalance());
  }

}
