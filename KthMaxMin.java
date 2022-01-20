import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMaxMin {
    static int getKthmin(List<Integer> nums, int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(nums);

        while(--k>0){
            minHeap.poll();
        }
        return minHeap.peek();
    }
    static int getKthMax(Integer []arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        maxHeap.addAll(Arrays.asList(arr));
        while(--k>0){
            maxHeap.poll();

        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        Integer[] nums=new Integer[n];
//        ArrayList<Integer> nums=new ArrayList<>();

        int i=0;
        while (i<n)
        {
            nums[i]=sc.nextInt();
            i++;
        }
        System.out.print("Enter the value of K: ");
        int k=sc.nextInt();
        List<Integer> list= Arrays.asList(nums);
        System.out.println("Kth Minimum Element: "+ getKthmin(list,k));
        System.out.println("Kth Maximum Element: "+ getKthMax(nums,k));
    }

}
