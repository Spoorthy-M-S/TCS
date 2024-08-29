package TCS;
import java.util.*;
public class GCD {
    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a<b){
                b=b%a;
            }
            else{
                a=a%b;
            }
        }
        if(a==0 && b==0){
            return 0;
        }
        return a==0?b:a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a & b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));


        
    }
    
}
