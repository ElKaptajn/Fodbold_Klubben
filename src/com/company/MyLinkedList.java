package com.company;

import java.util.Scanner;

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
    public String search(){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Enter 1 to see Team 1
                Enter 2 to see team 2
                Enter 3 to search by age
                Enter 4 to search by first name
                """);

        int answer= input.nextInt();
        ListNode current = front;
        String result ="";

        switch(answer){
            case 1:
                while(current != null) {
                    result += current.data;
                    current = current.next;
                    if(current.data.getTeam() == 1){
                        result += current;
                    }
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Wrong input... returning to main menu");
                break;
        }
        return result;
    }

    /*
    checkIndex(index);
    ListNode<E> current = gotoIndex(index – 1);
    current.next = current.next.next;
    current.next.prev = current;
    */


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