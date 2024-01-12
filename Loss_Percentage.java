import java.util.*;
public class ex5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float s=sc.nextFloat();
        float j=r-s;
        float k=(j*100)/r;
        System.out.printf("%.2f",k);
    }
}
   