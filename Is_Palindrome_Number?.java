import java.util.*;
public class hi{
    public static int palindrome(int n){
        int k=n;
        int a=0;
        int rev=0;
        while(n!=0){
            a=n%10;
            rev=(rev*10)+a;
            n/=10;
        }
        if(rev==k) return 2;
        else return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int call=palindrome(n);
        System.out.println(call);
    }
}