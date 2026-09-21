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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
        List<Integer> less=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
              if (cur.val < x) {
                less.add(cur.val);
            } else {
                greater.add(cur.val);
            }
            cur = cur.next;
        }
        cur =head;
        for (int val : less) {
            cur.val = val;
            cur = cur.next;
        }
        for (int val : greater) {
            cur.val = val;
            cur = cur.next;
        }
        return head;
        }
    }