import java.util.*;
public class Gk{
    public static void main (String args[]){
        Scanner r=new Scanner(System.in);
        long a=r.nextInt();
        int b=r.nextInt();
        
        long c=a%((int)Math.pow(10,b));
        int count =0;
        long d=a;
        while(d>0){
            count++;
            d=d/10;
        }
        int l=count-b;
        int m=(int)Math.pow(10,l);
        long x=a/m;
        System.out.print((long)Math.abs(c-x));
    }
}