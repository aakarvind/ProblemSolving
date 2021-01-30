/*
  Maximum and minimum of an array using minimum number of comparisons
  Algo:
  Pick the elements in pair and compare them
 */
import java.util.*;
public class MaxMinArray {
    static class Pair{
        int max;
        int min;
    }
    static Pair getMaxmin(int []ar,int n)
    {
        Pair minmax=new Pair();
        int i;
        if(n%2==0){
            if(ar[0]>ar[1]) {
                minmax.max=ar[0];
                minmax.min=ar[1];
            }
            else {
                minmax.max=ar[1];
                minmax.min=ar[0];
            }
            i=2;
        }
        else {
            minmax.max=ar[0];
            minmax.min=ar[0];
            i=1;
        }

        while(i<n-1){
            if(ar[i]>ar[i+1]){
                if(ar[i]> minmax.max)
                    minmax.max=ar[i];
                if (ar[i+1]< minmax.min)
                    minmax.min=ar[i+1];
            }
            else {
                if(ar[i+1]> minmax.max)
                    minmax.max=ar[i+1];
                if (ar[i]< minmax.min)
                    minmax.min=ar[i];
            }
            i=i+2;
        }
        return minmax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        int []nums=new int[n];
        int i=0;
        while (i<n)
        {
            nums[i]=sc.nextInt();
            i++;
        }
        Pair minmax=getMaxmin(nums,n);
        System.out.println("Maximum Element="+minmax.max);
        System.out.println("Minimum Element="+minmax.min);
    }

}
