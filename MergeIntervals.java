import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println();
        int [][]nums=new int[n][2];
        int i=0;
        while (i<n) {
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            i++;
        }

        int [][]result=merge2(nums);
        System.out.println("Merged Intervals:");
        for (int[] arr:nums){
            System.out.println(arr[0]+" , "+arr[1]);
        }
    }
    static int[][] merge2(int[][] intervals){
        int length=intervals.length;
        if(length<=1)
            return intervals;

        int[] start = new int[length];
        int[] end = new int[length];
        for(int i=0;i<length;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int startIndex=0;
        int endIndex=0;
        List<int[]> result = new LinkedList<>();
        while(endIndex<length){
            //as endIndex==length-1 is evaluated first, start[endIndex+1] will never hit out of index
            if(endIndex==length-1 || start[endIndex+1]>end[endIndex]){
                result.add(new int[]{start[startIndex],end[endIndex]});
                startIndex=endIndex+1;
            }
            endIndex++;
        }
        return result.toArray(new int[result.size()][]);
    }
    static int[][] merge(int[][] intervals) {
        if (intervals.length==0)
            return intervals;
        List<int []> result=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]); // sorted on the basis of intervals[i][0]
        int in[]=intervals[0];
        int i=1;
        while (i< intervals.length){
            if (intervals[i][0]>in[1]){
                result.add(in);
                in=intervals[i];
            }
            else {
                in[1]=Math.max(in[1],intervals[i][1]);
            }
            i++;
        }
        result.add(in);
        return result.toArray(new int[result.size()][]);
    }
}
