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
    static int hcf(int a,int b){
        int h = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                h = i;
            }
        }
        return h;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr = head;
        ListNode ptrn = head.next;
        while(ptrn!=null){
            int x = hcf(ptr.val,ptrn.val);
            ListNode temp = new ListNode(x);
            ptr.next = temp;
            temp.next = ptrn;
            ptr = ptrn;
            ptrn = ptrn.next;
        }
        return head;
    }
}