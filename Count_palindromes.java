import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            int num=a[i];
            int s=num;
            int rev=0;
            while(num!=0){
            int k=num%10;
             rev=(rev*10)+k;
             num/=10;
            }
            if(rev==s){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}