public class Main{
  public static void main{
    double capital = 10000.0;
    double interestRate = 0.05;
    double amount;

    system.out.printf("%s%20s%n", "Year", "Amount on Deposit");

    for (int year =1; year <=10; year++){
    amount = capital * Math.pow(1.0 + interestRate, year);
      
      System.out.printf("%3d%20.2f%n", year, amount );
    }


  }
}
