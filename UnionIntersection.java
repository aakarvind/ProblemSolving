import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersection {

    static Integer[] getUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        Integer[] result = set.toArray(new Integer[0]);
        return result;
    }

    static Integer[] getIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
            for (int i : arr1) {
                set.add(i);
            }
            for (int i : arr2) {
                set2.add(i);
            }
        Integer[] result =null;
            if(set.size()>set2.size()) {
                for(int i:set2){
                    if(!set.contains(i)){
                        set2.remove(i);
                    }
                }
                result = set2.toArray(new Integer[0]);
            }
            else{
                for(int i:set){
                    if(!set2.contains(i)){
                        set.remove(i);
                    }
                }
                result = set.toArray(new Integer[0]);
            }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in Array 1 & Array 2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println();
        int[] arr1 = new int[n1];
        int i = 0;
        while (i < n1) {
            arr1[i] = sc.nextInt();
            i++;
        }
        int[] arr2 = new int[n2];
        i = 0;
        while (i < n2) {
            arr2[i] = sc.nextInt();
            i++;
        }
        Integer[] result1 = getUnion(arr1, arr2);
        Integer[] result2 = getIntersection(arr1, arr2);
        System.out.println("Union Count:" + result1.length);
        System.out.println("Intersection Count:" + result2.length);
        System.out.println("Union Array:");

        for (Integer num : result1)
            System.out.print(num + " ");
        System.out.println("\nIntersection Array:");

        for (Integer num : result2)
            System.out.print(num + " ");

    }
}
