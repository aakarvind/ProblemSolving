import java.util.Scanner;

public class Sort012 {
    static int []nums;
    static void sort() {
        int low=0,mid=0,high=nums.length-1;
        int i=0;
        while(i< nums.length && mid<=high){
            if(nums[i]==0){
                swap(i,low);
                low++;mid++;i++;
            }
            else if (nums[i]==1){
                mid++;i++;
            }
            else{
                swap(i,high);
                high--;
            }
        }
    }
    static void swap(int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        nums=new int[n];
        int i=0;
        while (i<n)
        {
            nums[i]=sc.nextInt();
            i++;
        }
        sort();
        System.out.println("Sorted Elements: ");
        for(int num:nums) {
            System.out.print(num+" ");
        }

    }
}
