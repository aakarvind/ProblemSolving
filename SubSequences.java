//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

public class SubSequences {

//    static List<String> stringList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string :");
        String str=sc.next();
        SubSequences obj=new SubSequences();
        obj.findSubSequence(str,"");
//        System.out.println(stringList);

    }

    public void findSubSequence(String str,String ans){
        if(str.length()==0){
//            stringList.add(ans);
            if(!ans.isBlank()) {
                System.out.print(ans+" ");
            }
            return;
        }
        findSubSequence(str.substring(1),ans);
        findSubSequence(str.substring(1),ans+ str.charAt(0));


    }
}
