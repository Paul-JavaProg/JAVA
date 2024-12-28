package javaFundamentals;
import java.util.Scanner;

public class WhileLoops {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        /*String names[] = {"Paul","Alexander","Natasha","Ruben","Emman"};

        System.out.print("Name to search: ");
        String search = x.nextLine();
        
        int i = 0;
        /*do {
            System.out.println(i);
            i++;
            break;

        } while (i < 5);
       */
        
       /* 
        while (i < names.length) {

            if(names[i].equalsIgnoreCase(search)){
            System.out.println("I found " + names[i]);
            break;
            }
            else{
                System.out.println(names[i]);
            }
            i++;
        }
        */ 

        int lives = 3;
        String answer;

        while (lives > 0) {
            System.out.println("What is the Center of The Solar System: "); 
            System.out.print("Enter Answer: ");
            answer = x.nextLine();

            if(answer.equalsIgnoreCase("Sun")) break;
            else lives--;
            
        }
        if (lives > 0)System.out.println("You Won");
        else System.out.println("You Lost");




        
        x.close();
        
    }
    
}
