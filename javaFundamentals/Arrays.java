package javaFundamentals;
import java.util.*;

public class Arrays {

    public  static void main(String[] name) {

        Scanner s = new Scanner(System.in);

        int size = 5;
        String Email[] = new String[size];
        String Username[] = new String[size];
        String Password[] = new String[size];

        for (int i = 0; i < size; i++){

            System.out.print("Email: ");
            Email[i] = s.nextLine();
    
            System.out.print("Username:");
            Username[i] = s.nextLine();
    
            System.out.print("Password: ");
            Password[i] = s.nextLine();
        }
        for(int i = 0; i < size; i++){
            System.out.println("Email:    " + Email[i]);
            System.out.println("Username: " + Username[i]);
            System.out.println("Password: " + Password[i]);
    
        }
        
       
    }

}