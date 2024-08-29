package TCS;
public class PrintNumberOfWords {
    public static void main(String[] args) {
        String str="Focus academy for career enhancement";
        int cnt=1;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' ' && i!=str.length()-1){
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
    
}
