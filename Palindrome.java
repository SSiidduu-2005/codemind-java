import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        int a=0;
        int rev=0;
        while(n!=0){
            a=n%10;
            rev=(rev*10)+a;
            n/=10;
        }
        if(k==rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}