
/*Write a program to determine if a given number is even or odd using an if statement.*/
 import java.io.*;
 import java.util.Scanner;
 public class Main{
     public static void main(String args[]){
         Scanner scan= new Scanner(System.in);
         int num=scan.nextInt();
         if(num%2==0)System.out.println("Even Number");
         else {
             System.out.println("odd Number");
         }
     }
 }