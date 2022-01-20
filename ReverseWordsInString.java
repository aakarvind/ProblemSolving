public class ReverseWordsInString {
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for (int j = 0; j <= arr.length; j++) {
            if (j == arr.length || arr[j] == ' ') {
                reverseWord(arr, i, j - 1);
                i = j + 1;
            }
        }
        return new String(arr);
    }

    private static void reverseWord(char[] s, int i, int j) {
        while (i < j) {
            char c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }

    public static void main(String[] args) {
        String s="A example to reverse the words";
        System.out.println("Original"+s+"\nReversed -> "+reverseWords(s));
    }
}
