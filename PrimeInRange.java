package TCS;
public class PrimeInRange {
    public static void main(String[] args) {
        int x=20;
        int y=120;
        for(int i=x;i<=y;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
            if(n/i!=n){
                cnt++;
            }
        }
        if(cnt>2){
            return false;
        }
        return true;
    }
    
}
