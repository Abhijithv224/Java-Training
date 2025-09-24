/*Write a program to check if a number is positive, negative, or zero using an if-else statement*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if (num>0) System.out.println("positive number");
        else if(num<0)System.out.println("negative number");
        else System.out.println("Zero");
    }
}