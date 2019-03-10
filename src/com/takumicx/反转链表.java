package com.takumicx;

/**
 * @author: takumiCX
 * @create: 2019-03-09
 * @email: takumicx@zju.edu.cn
 **/
public class 反转链表 {



    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode newHead = reverseList(head);
        head.next.next=head;
        head.next=null;
        return newHead;
    }



    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
