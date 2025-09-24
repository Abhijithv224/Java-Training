/*Write a program to determine if a person is eligible to vote based on their age using an if-else statement.*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if (age>=18)System.out.println("Eligibe to vote");
        else{
            System.out.println("not eligible");
        }
	}
}
