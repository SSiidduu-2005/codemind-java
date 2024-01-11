import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float s1=sc.nextFloat();
        float s2=sc.nextFloat();
        float h=(s1*s1)+(s2*s2);
        System.out.printf("%.2f",Math.sqrt(h));
    }
}