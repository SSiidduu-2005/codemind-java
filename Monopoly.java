import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            boolean b=false;
            if((r1+r2)<r3 || (r2+r3)<r1 || (r1+r3)<r2)
                b=true;
                if(b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}