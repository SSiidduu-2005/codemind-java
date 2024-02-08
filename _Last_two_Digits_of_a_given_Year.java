import java.util.*;

public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = Math.abs(k) % 100;
        if(k>=0 &&k<10){
            System.out.printf("0%d
",k);
        }
        else System.out.printf("%d
",k);
    }
}