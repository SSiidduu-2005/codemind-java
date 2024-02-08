import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f = ((c * 9.0f) / 5) + 32;
        System.out.printf("%.2f",f);
    }
}