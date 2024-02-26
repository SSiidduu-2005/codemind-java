import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
    }
}