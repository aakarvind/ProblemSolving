/**
 * Definition for singly-linked list.
 * https://leetcode.com/problems/palindrome-linked-list/
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr=head,ptrMid=head;

        while(ptr!=null && ptr.next!=null){
            ptr=ptr.next.next;
            ptrMid=ptrMid.next;
        }
        ptrMid=reverse(ptrMid);
        ptr=head;
        // System.out.println("Reverse->>>"+ptr.val+"   "+ ptrMid.val);
        while(ptrMid!=null){
            // System.out.println(ptr.val+"   "+ ptrMid.val);
            if(ptr.val!=ptrMid.val){
                return false;
            }
            ptr=ptr.next;
            ptrMid=ptrMid.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

        return head;
    }
}