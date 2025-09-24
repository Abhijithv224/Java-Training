/*
3.Write a program to find the largest of two numbers using an if-else statement.
*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num_1=scan.nextInt();
        int num_2=scan.nextInt();
        if(num_1>num_2)System.out.println("num_1 is largest");
        else{
            System.out.println("Num2 is largest");
        }
    }
}