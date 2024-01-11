import java.util.*;
public class hi
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        int d=(c/a)+(c/b);
        int x=c/d;
        System.out.println(x);
    }
}