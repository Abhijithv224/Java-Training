/*8.Write a program to find the smallest of three numbers using  if-else-if statements.*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a<=b && a<=c){
            System.out.println("a is smaller");
            
            
        }
        else if(b<=a && b<=c) System.out.println("b is smaller");
        else{
            System.out.println("c is smaller");
        }
        
	}
}
