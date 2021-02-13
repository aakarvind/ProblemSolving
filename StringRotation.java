import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String str1=sc.next();
        System.out.println("Enter the string 2:");
        String str2=sc.next();
        System.out.println((checkRotation(str1,str2)));

    }
    static boolean checkRotation(String str1,String str2){
        if(str1.length()==str2.length()){
            String temp = str1.concat(str1);
            return temp.contains(str2);
        }
        return false;
    }
}
