/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode Temp = head;
        while(Temp!=null){
            ListNode T = Temp;
            int sum = 0;
            while(T.val!=0){
                sum+=T.val;
                T=T.next;
            }
            Temp.val = sum;
            Temp.next = T.next;
            Temp = Temp.next;
        }
        
        return head;
    }
}