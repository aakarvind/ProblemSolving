import java.util.Scanner;

public class MinimumNuberOfJumps {
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
        int result=jumps(nums);
        System.out.println("Minimum number of jumps to reach end :"+ result);
    }
    static int jumps(int []nums){
        int maxReach=nums[0],step=nums[0],jumps=1;
        if(nums[0]==0)
            return -1;
        if(nums.length<=1)
            return 0;
        for(int i=1;i<nums.length;i++){
            if(i== nums.length-1)
                return jumps;
            maxReach=Math.max(maxReach,i+nums[i]);
            step--;
            if(step==0) {
                jumps++;

                if (i >= maxReach)
                    return -1;

                    step = maxReach - i;
                }
            }
        return -1;
    }
}
