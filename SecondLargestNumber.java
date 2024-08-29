package TCS;
public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,7,10,19,18};
        int first=Integer.MIN_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                sec=first;
                first=arr[i];
            }
            if(sec<arr[i] && arr[i]<first){
                sec=arr[i];
            }
        }
        System.out.println("Second Largest Number is:"+sec);
    }
    
}
