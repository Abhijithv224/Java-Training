/*14.Write a program to calculate the income tax based on the following tax:
No tax if income is less than ₹10,000.
10% tax for income between ₹10,000 and ₹30,000.
20% tax for income between ₹30,000 and ₹50,000.
30% tax for income above ₹50,000*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a<10000)System.out.println("no income tax");
        else if(a>=10000 && a<30000)System.out.println("10% tax");
        else if(a>=30000 && a<50000)System.out.println("20% tax");
        else{
            System.out.println("30% tax");
        }
	}
}
