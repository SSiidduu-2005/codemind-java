import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int cnt=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%k!=0){
            cnt++;
            }
        }
        System.out.println(cnt);
    }
}