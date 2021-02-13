import java.util.Scanner;

public class PalindromeLongestSubstring {
    static int start=0, low=0, high=0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.next();
        PalindromeLongestSubstring obj=new PalindromeLongestSubstring();
        int maxLength=obj.longestSubstring(str);
        System.out.println("Maximum length of Substring :"+maxLength);
        System.out.println("Substring : "+str.substring(start,start+ maxLength));
    }
    public int longestSubstring(String str){

        int max=1;
        for(int i=0;i<str.length();i++){
            //odd length
            low=i-1;high=i+1;
            while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
                if(high-low+1>max){
                    start=low;
                    max=high-low+1;
                }
                low--;high++;
            }
            //even length
            low=i-1;
            high=i;
            while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
                if(high-low+1>max){
                    start=low;
                    max=high-low+1;
                }
                low--;high++;
            }
        }
        return max;
    }
}
