import java.util.Arrays;
import java.util.Scanner;

public class MinimizeHeights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        int []nums=new int[n];
        int i=0;
        while (i<n) {
            nums[i]=sc.nextInt();
            i++;
        }
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        int result=minimize(nums,k);
        System.out.println("Difference :"+ result);
    }
    static int minimize(int []nums,int k){

        if(nums.length==1)
            return 0;
        Arrays.sort(nums);
        int diff=nums[nums.length-1]-nums[0];

        int small=nums[0]+k;
        int big=nums[nums.length-1]-k;

        if(small>big){
            int temp=small;
            small=big;
            big=temp;
        }
        for(int i=1;i<nums.length-1;i++){
            int temp_big=nums[i]+k;
            int temp_small=nums[i]-k; //sub

            if(temp_big>=big || temp_small<=small)
                continue;
            if(big-temp_small<=temp_big-small)
                small=temp_small;
            else
                big=temp_big;
        }


        return Math.min(diff,big-small);
    }
}
