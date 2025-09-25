/*11.STAR PATTERN*/
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid || i==j || i+j==n+1 || j==mid){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println( );
        }
    }
}