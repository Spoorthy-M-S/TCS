package TCS;
public class SumOfEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9};
        int sum=4;
        int f=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+arr[j]);
                    System.out.println("Sum Exists!");
                    f=1;
                    break;
                }
            }
        }
        if(f==0){
            System.out.println("Sum do not exist!");
        }
    }
    
}
