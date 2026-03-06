import java.util.Scanner;

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
  int grade;
  int total=0;
  double avg =0;
    //for loop 
    for(int i=0; i <= 10;i++){
      System.out.println("Enter the grade of Student number " +(i+1)+ " int the list: ");
    grade = input.nextInt();
      total += grade;
 }

    //Do.....While loop
    //int count=0;
   // do{
   //   System.out.println("Enter the grade of Student number " +(count+1)+ " int the list: ");
  //    grade = input.nextInt();
  //    total += grade;
  //    count++;
  //  }while(count < 10);

  avg = total/10;
  System.out.println("The total is: " +total);
     System.out.println("The average is: " +avg);
}

