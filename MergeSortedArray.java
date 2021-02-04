import java.util.Scanner;

public class MergeSortedArray {
     static int[] nums1,nums2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in Array 1 and Array 2: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println();
        nums1=new int[n];
        nums2=new int[m];
        int i=0;
        while (i<n) {
            nums1[i]=sc.nextInt();
            i++;
        }
        i=0;
        while (i<m) {
            nums2[i]=sc.nextInt();
            i++;
        }
        sortArray(nums1,nums2);
        System.out.println("Sorted Array: ");
        for(int j:nums1){
            System.out.print(j+" ");
        }
        for(int j:nums2){
            System.out.print(j+" ");
        }
    }
    static int nextGap(int gap){
        if(gap<=1)
            return 0;
        return gap/2+(gap%2);
    }
    static void sortArray(int []nums1,int []nums2 ){
        int n=nums1.length;
        int m= nums2.length;
        int gap=nextGap(n+m);
        while (gap!=0){
            int  i;
            for(i=0;i+gap<n;i++){
                if(nums1[i]>nums1[i+gap]){
                    int temp=nums1[i];
                    nums1[i]=nums1[i+gap];
                    nums1[i+gap]=temp;
                }
            }
            int j;
            for(j=gap>n?gap-n:0;i<n && j<m;j++,i++){
                if(nums1[i]>nums2[j]){
                    int temp=nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=temp;
                }
            }
            if(j<m){
                for(j=0;j+gap<m;j++){
                    if(nums2[j]>nums2[j+gap]){
                        int temp=nums2[j];
                        nums2[j]=nums2[j+gap];
                        nums2[j+gap]=temp;
                    }
                }
            }
            gap=nextGap(gap);
        }

    }

}
