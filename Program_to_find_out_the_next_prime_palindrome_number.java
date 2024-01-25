import java.util.*;

public class Hi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n + 1;
        int a = 0;
        int k = 0;
        int N = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        
        while (true) {
            a = 0;
            k = 0;
            N = i;
            cnt1 = 0;
            cnt2 = 0;

            while (N != 0) {
                a = N % 10;
                k = (k * 10) + a;
                N /= 10;
            }

            if (k == i) {
                cnt2 = 1;
            } else {
                i++;
                continue;
            }

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    cnt1++;
                }
            }

            if (cnt1 == 1) {
                break;
            }

            i++;
        }

        System.out.println(i);
    }
}
