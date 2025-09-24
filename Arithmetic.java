/*1.write a code for performing arithmetic operations (+,-,*,/,%)
*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        char oper=scan.next().charAt(0);
        switch(oper){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
        }
    }
}