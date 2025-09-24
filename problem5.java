/*Write a program to determine whether a given year is a leap year or not using an if-else statement*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        if(year%4==0)
        System.out.println("leap year");
        else{
            System.out.println("not a leap year");        }
    }
}