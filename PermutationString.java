import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str= scanner.next();
        PermutationString obj=new PermutationString();
        obj.permutateString(str,0,str.length()-1);
    }
    void permutateString(String str,int left,int right){
        if(left==right){
            System.out.print(str+" ");
        }
        else {
            for(int i=left;i<=right;i++){
                str=swap(str,left,i);
                permutateString(str,left+1,right);
                str=swap(str,left,i);
            }
        }
    }
    String swap(String str,int i,int j){
        char []ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
}
