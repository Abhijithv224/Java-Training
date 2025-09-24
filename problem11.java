/*11.  Write a program that accepts the marks of five subjects and calculates the average. If the average is 
above 90, print "Distinction," if between 75 and 90, print "First Division," between 50 and 75, print "Second 
Division," otherwise print "Fail."*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int average=(a+b+c+d+e)/5;
        if (average>90)System.out.println("Distinction");
        else if (average<=90 && average>75){
            System.out.println("First Division");
        }
        else if(average<=75 && average>50) System.out.println("Second Division");
        else{
            System.out.println("fail");
        }
        
	}
}
