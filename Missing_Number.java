import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int k=(n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        int s=k-sum;
        System.out.println(s);
    }
}