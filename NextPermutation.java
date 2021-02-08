/*
 find the first decreasing num a
 find the smallest num that is greater than a, and swap it with a
 reverse the right part of index i
*/

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class NextPermutation {
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

        int []result=nextPermutation(nums);
        System.out.println("Merged Intervals:");
        for (int arr:result){
            System.out.print(arr+" ");
        }
    }
    @Contract("_ -> param1")
    public static int[] nextPermutation(int []nums){
        int right= nums.length-2;
        while(right>=0 && nums[right+1]<=nums[right]){
            right--;
        }
        if(right>=0) {
            int justGreater = nums.length - 1;
            while (justGreater>0 && nums[justGreater]<=nums[right]){
                justGreater--;
            }
            int temp=nums[justGreater];
            nums[justGreater]=nums[right];
            nums[right]=temp;
        }
        int left=right+1;
        right= nums.length-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;right--;

        }
        return nums;
    }
}
