import java.util.Scanner;
public class studentRegistrationSimple {
    String name, surname, studentNumber;
    String major1 = "", major2 = "", major3 = "";
    String elective = "";

    // Constructor
    public studentRegistrationSimple(String name, String surname, String studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the 2025 Registration Portal ===");

        System.out.print("Enter student's first name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter your final high school average (%): ");
        double average = scanner.nextDouble();
        scanner.nextLine();

        if (average < 60) {
            System.out.println("Minimum entry requirement not met. Registration denied.");
            return;
        }

        studentRegistrationSimple student = new studentRegistrationSimple(name, surname, studentNumber);

        System.out.println("\nSelect at least 2 major courses (16 credits each):");
        student.selectMajors(scanner);

        System.out.println("\nSelect 1 elective course (8 credits):");
        student.selectElective(scanner);

        student.printProofOfRegistration();
    }

    // Method to select majors
    public void selectMajors(Scanner scanner) {
        System.out.println("1. Computer Science");
        System.out.println("3. Mathematics");
        System.out.println("4. Statistics");
        System.out.println("5. Physics");

        System.out.print("Select first major (1-4): ");
        major1 = getMajor(scanner.nextInt());

        System.out.print("Select second major (1-4): ");
        major2 = getMajor(scanner.nextInt());
    }

    // Method to select elective
    public void selectElective(Scanner scanner) {
        System.out.println("1. Chemistry");
        System.out.println("2. Geography");
        System.out.println("3. Geology");
        System.out.println("4. GIS");

        System.out.print("Select elective (1-4): ");
        elective = getElective(scanner.nextInt());
    }

    // Method to print registration
    public void printProofOfRegistration() {
        System.out.println("\n===============================================");
        System.out.println("     Proof of Registration for 2025 Academic Year");
        System.out.println("===============================================");
        System.out.println("Student Name     : " + name + " " + surname);
        System.out.println("Student Number   : " + studentNumber);
        System.out.println("Major Courses    : ");
        System.out.println("  - " + major1);
        System.out.println("  - " + major2);
        System.out.println("Elective Course  : " + elective);
        System.out.println("===============================================");
        System.out.println("Registration successful. Welcome to 2025!");
    }

    // Method to return major name
    public String getMajor(int choice) {
        if (choice == 1) return "Computer Science";
        else if (choice == 3) return "Mathematics";
        else if (choice == 4) return "Statistics";
        else if (choice == 5) return "Physics";
        else return "Invalid Major";
    }

    // Method to return elective name
    public String getElective(int choice) {
        if (choice == 1) return "Chemistry";
        else if (choice == 2) return "Geography";
        else if (choice == 3) return "Geology";
        else if (choice == 4) return "GIS";
        else return "Invalid Elective";						 
    }
}
