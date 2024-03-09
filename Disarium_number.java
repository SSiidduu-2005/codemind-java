import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N=n;
        int a=0;
        int rev=0;
        int sum=0;
        int v=1;
        while(n!=0){
            a=n%10;
            rev=(rev*10)+a;
            n/=10;
        }
        while(rev!=0){
            a=rev%10;
            rev/=10;
            sum=sum+(int)Math.pow(a,v);
            v++;
        }
        if(sum==N){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}