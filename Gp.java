package TCS;
import java.util.*;
public class Gp {
    //1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187......
    //1,2,3,4,5,6,7,8 ,9, 10,11, 12,13, 14, 15,16
    public static int result1(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*2;
        }
        return res;

    }
    public static int result2(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*3;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        if(n%2==1){
            ans=result1(n/2+1);
        }
        else{
            ans=result2(n/2);
        }
        System.out.println(ans);
    }
}
