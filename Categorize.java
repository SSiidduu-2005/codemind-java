import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        if(n<150){
            System.out.println("Person is Dwarf.");
        }
        else if(n>150 && n<=165){
            System.out.println("Person is average heighted.");
        }
        else if(n>165 && n<=195){
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}