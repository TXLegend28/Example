import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] uniqueNumbers = new int[5];
        int uniqueCount = 0;

        for (int i = 0; i < 5; i++) {

            int number;

            // Ensure input is between 10 and 100 (inclusive)
            do {
                System.out.print("Enter a number between 10 and 100 (inclusive): ");
                number = input.nextInt();

                if (number < 10 || number > 100) {
                    System.out.println("Invalid input! Must be between 10 and 100.");
                }

            } while (number < 10 || number > 100);

            // Check for duplicates
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // Store only if NOT duplicate
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = number;
                uniqueCount++;
            }

            // Display current unique values
            System.out.println("Current unique values:");
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            //Attempt management
            int Attempt=0;
            int Remain=5;
            Attempt=Attempt+i;
            Attempt++;
            Remain-=Attempt;
            System.out.println("\nAttempt: "+Attempt+" : "+Remain+" Attempts remaining");
        }

        input.close();
    }
}