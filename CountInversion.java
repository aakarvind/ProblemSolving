import java.util.Arrays;
import java.util.Scanner;

public class CountInversion {
    static int count=0;
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
        int result[]=mergeSort(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println("\nInversion Count: "+(count));
    }
    static int[] mergeSort(int []nums){
        if(nums.length==1)
            return nums;
        int mid=(nums.length)/2;
        int []left=mergeSort(Arrays.copyOfRange(nums,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    static int[] merge(int []left,int[]right){
        int left_length= left.length;
        int right_length= right.length;
        int result[]=new int[left_length+right_length];
        int i=0,j=0,r=0;
        while (i<left_length && j<right_length){
            if(left[i]<=right[j]){
                result[r++]=left[i];
                i++;
            }
            else {
                count+=(left_length-i);
                result[r++]=right[j];
                j++;
            }
        }
        while(i<left_length){
            result[r++]=left[i++];
            i++;
        }
        while (j<right_length){
            result[r++]=right[j];
            j++;
        }
        return result;
    }
    /*static int inversionCount(int []nums){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
        }

        return count;
    }*/
}
