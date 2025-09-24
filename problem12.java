/*12. Write a program that takes the day number (1 for Monday, 2 for Tuesday, etc.) and prints whether it's a 
weekday or weekend using a switch statement.*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String day1=scan.next();
       String day2=scan.next();
        String day3=scan.next();
        String day4=scan.next();
        String day5=scan.next();
        String day=scan.next();
        switch (day){
            case "day1":
                System.out.println("weekday and monday");
                break;
            case "day2":
                System.out.println("weekday and tuesday");
                break;
            case "day3":
                System.out.println("weekday and wed");
                break;
            case "day4":
                System.out.println("weekday and thurs");
                break;
            case "day5":
                System.out.println("weekday and fri");
                break;
            default:
                
                System.out.println("weekend");
                break;
            
        }
	}
}
