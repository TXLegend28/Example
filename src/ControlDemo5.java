import java.util.Scannner;

public class Main{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int grade;
    int total;
    double avg = 0;
    int gradeCount = 0;
    int aGradeCount = 0;
    int bGradeCount = 0;
    int cGradeCount = 0;
    int dGradeCount = 0;
    int fGradeCount = 0;

    //Prompt the user to enter a grade or type a character to quit

    System.out.printf("%s%n%s%n %s%n %s%n", "Enter student grade (0-100)", "Type the end-of-file to quit", 
                      "On Unix/Linux/Mac OS X Type <Crtl> d", "On Windows OS Type <Crtl> z then press Enter");
      
  while(input.hasNextInt()){
    gradeCount++;
    grade = input.nextInt();
    total += grade;

    switch(grade/10){
      case 9:
      case 10:
        aGradeCount++;
        break;
      case 8:
        bGradeCount++;
        break;
      case 7:
      cGradeCount++;
        break;
      case 6:
        dGradeCount++;
        break;
      default:
        fGradeCount++;
        break;
        
      }
    
    }
    if (gradeCount != 0){
      avg = (double) total / gradeCount
        system.out.printf("The Total: %d%n", total);
        system.out.printf("The Average: %.2f%n", avg);
      system.out.printf("%n%s%d%n%n%s%d%n%n%s%d%n%n%s%d%n%n%s%d%n", 
                                    "A:", aGradeCount,
                                    "B:", bGradeCount,
                                    "C:", cGradeCount,
                                    "D:", dGradeCount,
                                    "F:", fGradeCount);
    }
    else{
    System.out.println("No grades entered.");
    }
  }
  
}
