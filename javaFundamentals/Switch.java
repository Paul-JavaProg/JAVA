package javaFundamentals;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int month;
        int date;
        int year;
        
        System.out.print("Month: ");
        month = x.nextInt();

        System.out.print("Date:  ");
        date = x.nextInt();

        System.out.print("Year:  ");
        year = x.nextInt();

        String monthWord = "";

        switch (month) {
            case 1:
                monthWord = "January";
                break;
            case 2:
                monthWord = "Febuary";
                break;
            case 3:
                monthWord = "March";
                break;
            case 4:
                monthWord = "April";
                break;
            case 5:
                monthWord = "May";
                break;
            case 6:
                monthWord = "June";
                break;
            case 7:
                monthWord = "July";
                break;
            case 8:
                monthWord = "August";
                break;
            case 9:
                monthWord = "September";
                break;
            case 10:
                monthWord = "October";
                break;
            case 11:
                monthWord = "November";
                break;
            case 12:
                monthWord = "December";
                break;
            default:
        }
        System.out.println();

        if (monthWord == "") {
            System.out.println("Invalid Month");
        }
        else{

            if(date > 31 || date <= 0){
                System.out.println("Invalid Date");
                System.out.println("Enter a valid Date");
            }
            else{
                System.out.println(monthWord + " " + date + ", " + year);
            }
        }

        

        
    }
    
}
