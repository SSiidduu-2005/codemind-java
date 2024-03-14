import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt1;i++){
            System.out.print("0"+" ");
        }
        for(int i=0;i<cnt2;i++){
            System.out.print("1"+" ");
        }
    }
}