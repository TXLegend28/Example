import java.util.Scanner;
public class ArrayDemo1{

  public static void main(String[] args){
    double[] monthlyRainfall = new double[12];
    Scanner input = new Scanner(System.in);

    double sum = 0.0, annualRainfallAvg;

    for(int i=0; i<monthlyRainfall.length; i++){
      System.out.println("Enter the rainfall average for month " +(i+1) + " : ");
      monthlyRainfall[i] = input.nextDouble();
      sum += monthlyRainfall[i];
    }
    annualRainfallAvg = sum/monthlyRainfall.length;
    System.out.println("The annual average rainfall is: " +annualRainfallAvg);

    for(int i=0; i<monthlyRainfall.length; i++){
      double difference = monthlyRainfall[i] - annualRainfallAvg;
      System.out.printf("%3d%20.2f%20.2f%n", (i+1), monthlyRainfall[i], difference);
    }


  }

}
