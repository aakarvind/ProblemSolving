import java.util.Scanner;

public class ContiguosMaximumSumSubArray {
    static int start=0;
    static int end=0;
    static int sum=0;
    public static void maximumsumArray(int []nums){
        int s=0,i=0;start=0;end=0;
        sum=nums[0];
        int temp_max=0;
        while (i< nums.length){
            temp_max=temp_max+nums[i];
            if(temp_max>sum){
                sum=temp_max;
                start=s;end=i;
            }
            if(temp_max<0){
                temp_max=0;
                s=i+1;
            }
            i++;
        }

    }
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
        maximumsumArray(nums);
        System.out.println("\nMaximum Sum of the contiguous subarray : "+sum);
        System.out.println("Sub-Array :");
        for(int s=start;s<=end;s++){
            System.out.print(nums[s]+" ");
            sum+=nums[s];
        }


    }
}
