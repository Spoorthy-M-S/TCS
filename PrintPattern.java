package TCS;
import java.util.Scanner;
class PrintPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0  || i==n-1 || j==n-1){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
/*
 *     1 1 1 1 1 
*      1 0 0 0 1 
*      1 0 0 0 1 
*      1 0 0 0 1 
*      1 1 1 1 1 
 */