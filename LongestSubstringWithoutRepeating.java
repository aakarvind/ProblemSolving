// Given a string s, find the length of the longest substring without repeating characters.
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;int j=0;int max=1;
        if(s.length()<2){
            return s.length();
        }
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max=Math.max(max,set.size());
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}