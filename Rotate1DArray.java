import java.util.Scanner;

public class Rotate1DArray {
    static int[] nums;
    static void rotate(int k){
        reverse(0, nums.length-1);
        reverse(0,k-1);
        reverse(k, nums.length-1);

    }
    static void reverse(int start,int end){
        while (start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        nums=new int[n];
        int i=0;
        while (i<n) {
            nums[i]=sc.nextInt();
            i++;
        }
        System.out.print("Enter the Rotation term: ");
        int k=sc.nextInt();
        k=k%(nums.length);
        rotate(k);
        System.out.println("Rotated Array: ");
        for(int num:nums)
            System.out.print(num+" ");
    }
}
