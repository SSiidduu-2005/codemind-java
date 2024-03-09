import java.util.*;
public class hi{
    public static int rev_digit(int n){
        int a=0;
        int rev=0;
        while(n!=0){
        a=n%10;
        rev=(rev*10)+a;
        n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=rev_digit(n);
        if((n*n)==rev_digit(rev*rev)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}