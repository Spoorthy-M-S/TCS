package TCS;

public class AmstrongNumberBetweenInterval {
    public static void main(String[] args) {
        int x=127;
        int y=427;
        for(int i=x;i<=y;i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }
       // System.out.println(CountDig(1001));
    }
    public static int CountDig(int n){
        int cnt=0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        return cnt;
    }
    public static boolean isAmstrong(int n){
        int pow=CountDig(n);
        int sum=0;
        int num=n;
        while(num!=0){
            int ld=num%10;
            sum+=Math.pow(ld,pow);
            num=num/10;
        }
        return sum==n?true:false;
    }
}
