package javaFundamentals;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Math:     ");
        double mathGrade = s.nextDouble();

        System.out.print("Science:  ");
        double scienceGrade = s.nextDouble();

        System.out.print("English:  ");
        double englishGrade = s.nextDouble();
        
        System.out.print("Computer: ");
        double computerGrade = s.nextDouble();

        double average = (mathGrade + scienceGrade + englishGrade + computerGrade ) /4;

        System.out.println();
        System.out.println("Average:  " + average);

        if (average >= 100) {
            System.out.println("Invalid Grade");
        }
         else if (average >= 98) {
            System.out.println("With Highest Honors");
        }
        else if(average >= 95){
            System.out.println("With High Honors");  
        }
        else if(average >= 90){
            System.out.println("With Honors");
        }
        else if(average >= 75){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

    }
    
}
