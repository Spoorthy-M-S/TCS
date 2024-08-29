package TCS;
public class FirstAndLastOccurences {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,3,3,4,8,8,8,8};
        int x=8;
        int firstO=-1;
        int lastO=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x && firstO==-1){
                firstO=i;
            }
            else if(firstO!=-1 && arr[i]==x){
                lastO=i;
            }
        }
        if(firstO==-1){
            System.out.println("not found");
        }
        else{
        System.out.println(x+" Occurs at index "+firstO+" And "+lastO);
    }
    
}}
