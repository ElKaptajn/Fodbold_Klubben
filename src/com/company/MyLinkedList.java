package com.company;

public class MyLinkedList {
    private ListNode front;

    public MyLinkedList(){
        this.front = null;
    }

    public void addSorted(MemberPlayer memberPlayer){
        ListNode prev = null;
        ListNode current = front;
        while(current != null && memberPlayer.compareTo(current.data) > 0) {
            prev = current;
            current = current.next;
        }
        if(prev == null){
            front = new ListNode(memberPlayer, front);
        }else{
            prev.next = new ListNode(memberPlayer, prev.next);
        }
    }
    @Override
    public String toString(){
        if(front == null){
            return "The list is empty";
        }else{
            String result = ""+front.data;
            ListNode current = front.next;
            while(current != null) {
                result += current.data;
                current = current.next;
            }
            return result;
        }
    }
}