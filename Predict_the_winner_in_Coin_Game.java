import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=Math.max(p1,p2);
        if(p3%2==0&&p3>2){
            System.out.print("Player 1");
        }
        else{
            System.out.print("Player 2");
        }
    }
}