package io.hedwig.alg.learnalg.linkedlist;


/**
 * Created by patrick on 15/6/9.
 *
 * @version $Id$
 */


public class ListNode {

    private ListNode next;
    private ListNode current;

    public ListNode reserve(ListNode head){
        ListNode prev =null;
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;
    }

    public ListNode next(){
        return new ListNode();
    }
}
