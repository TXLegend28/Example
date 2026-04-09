import java.util.Scanner;

public class studentRegistration {

    String name, surname, studentNumber;
    String major1 = "", major2 = "", major3 = "";
    String elective = "";


    public studentRegistration(String name, String surname, String studentNumber) {

        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registration Portal");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your Student Number: ");
        String studentNumber = scanner.nextLine();

        System.out.println("Enter your grade average: ");
        double average = scanner.nextDouble();

        if(average < 60){
            System.out.println("Not eligible for registration");
            return;}

        studentRegistration student = new studentRegistration(name, surname, studentNumber);

        System.out.println("\n Select 2 major courses: ");
        student.selectMajor(scanner);
        System.out.println("\n Select 1 elective course: ");
        student.selectElective(scanner);

        student.printProofOfRegistration();
}

public void selectMajor(Scanner scanner){

        System.out.println("1. Computer Science");
    System.out.println("3. Mathematics");
    System.out.println("4. Statistics");
    System.out.println("5. Physis");

    System.out.println("Select for first Major course (1-4): ");
    major1 = getMajor(scanner.nextInt());

    System.out.println("Select for second Major course (1-4): ");
    major2 = getMajor(scanner.nextInt());


}
public void selectElective(Scanner scanner){

        System.out.println("1. Chemistry");
    System.out.println("2. Geography");
    System.out.println("3. Geology");
    System.out.println("4. GIS");

    System.out.println("Select for elective (1-4): ");
    elective = getElective(scanner.nextInt());

}

public String getMajor(int choice){
        if(choice == 1) return"Computer Science";
        else if(choice ==3) return "Mathematics";
        else if (choice ==4) return "Statistics";
        else if (choice ==5) return "Physics";
        else return "Invalid major course";
}

public String getElective(int choice){
        if(choice ==1)return "Chemistry";
        else if(choice ==2)return "Geography";
        else if(choice ==3)return "Geology";
        else if(choice ==4)return "GIS";
        else return "Invalid elective course";
}

public void printProofOfRegistration(){
        System.out.println("==========================================");
        System.out.println("Proof of Registration");
        System.out.println("==========================================");
        System.out.println("Student's name:   " +name +" " +surname);
        System.out.println("Student number:   " +studentNumber);
        System.out.println("Major courses:  " );
        System.out.println("- " +major1);
        System.out.println("- " +major2);
        System.out.println("Elective courses: " +elective);
        System.out.println("===========================================");

    }
}