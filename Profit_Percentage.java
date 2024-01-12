import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=b-a;
        float d=(c*100)/a;
        System.out.printf("%.2f",d);
    }
}