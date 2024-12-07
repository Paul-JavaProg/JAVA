package javaFundamentals;
import java.util.*;

public class Arrays {

    public static void main(String[] args) {

       /*  String email[] = {"paul@gmail.com",
                          "jay@gmail.com",
                          "yawa@gmail.com"};

        String usernames[] = {"Paul",
                             "Jay",
                             "Madi"};

        String password[] = {"gsuwru11",
                             "iwho23",
                             "wuhfw45"};
        int i = 2;

        System.out.println("Index:    " + i);
        System.out.println("Email:    " + email[i]);
        System.out.println("Username: " + usernames[i]);
        System.out.println("Password: " + password[i]);
        */

        Scanner s = new Scanner(System.in);

        int size = 100;
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