/*/*4.Write a program to check whether a character entered by the user is a vowel or consonant using a switch 
statement.===>char c='I';//next().charAt(0);*/
import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        char val=scan.next().charAt(0);
        switch(val){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowels");
            break;
            default :{
                System.out.println("Consonants");
            }
        }
    }
}