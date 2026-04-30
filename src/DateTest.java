import java.util.Scanner;
public class DateTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("\nYear: ");
        int year = scanner.nextInt();

        Date mydate = new Date(day, month, year);
        System.out.println("======DATE======");
        mydate.displayDate();
    }
}
