/*7.Write a program to check whether a number is divisible by both 3 and 5 using an if statement.*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if ((num%3==0) && (num%5==0)){
            System.out.println("divisible by both 3 and 5");
        }
    }
}