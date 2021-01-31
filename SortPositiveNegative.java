import java.util.Scanner;

public class SortPositiveNegative {
    static int []nums;
    static void sort(){
        int left=0,right= nums.length-1;
        int i=0;
        while (left<=right){
            if(nums[left]<0 && nums[right]<0)
                left++;
            else if(nums[right]>0 && nums[left]>0)
                right--;
            else if (nums[left]>0 && nums[right]<0){
                swap(left,right);
                left++;right--;
            }
            else {
                left++;
                right--;
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
            System.out.print(num + " ");
        }
    }
}
