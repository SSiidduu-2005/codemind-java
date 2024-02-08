import java.util.*;

public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k=5*x+10*y;
        if(k>=z){
            System.out.printf("%d",k/z);
        }
        else{
            System.out.println("0");
        }
    }
}
