import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.printf("%d %d ",a,b);
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.printf("%d ",c);
            a=b;
            b=c;
        }
    }
}