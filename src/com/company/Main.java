package com.company;

import java.util.Scanner;

/**
 * 2. Make a main that produces a menu with options to create new players/members as objects, list all members/players in a sorted list, search for a player, delete a player or search for all the players on the first or second team / or within an age interval.
 * 3. Create all the methods.
 * 4. Make the appropriate files and the code to handle the reading and writing to and from files.
 * 5. Create 30 members/players in random order, you have to variate age (between 10 - 35), first-/second team.
 * 6. Test that all the functionality works!
 * 7. Make it possible for the user to choose which field the list should be sorted by.
 */

public class Main {

    public static void main(String[] args) {

        MyLinkedList playerList = new MyLinkedList();

        //Hard code members:
        MemberPlayer newMember5 = new MemberPlayer("Egon", "Petersen", 56, 2);
        MemberPlayer newMember1 = new MemberPlayer("Xenius", "Blom", 25, 1);
        MemberPlayer newMember2 = new MemberPlayer("Mads", "Moby", 24, 1);
        MemberPlayer newMember3 = new MemberPlayer("Emil", "Biksemad", 24, 1);
        MemberPlayer newMember4 = new MemberPlayer("Egon", "Larsen", 90, 2);
        MemberPlayer newMember6 = new MemberPlayer("Jonas", "Petersen", 25, 1);
        MemberPlayer newMember7 = new MemberPlayer("Kristian", "Jørgensen", 30, 2);
        playerList.addSorted(newMember1);
        playerList.addSorted(newMember2);
        playerList.addSorted(newMember3);
        playerList.addSorted(newMember4);
        playerList.addSorted(newMember5);
        playerList.addSorted(newMember6);
        playerList.addSorted(newMember7);


        Scanner input = new Scanner(System.in);
        int answer = -1;

        while(answer != 0){
            System.out.println("""
                    \n
                    Enter 0 to exit the program
                    Enter 1 to create a new player
                    Enter 2 to show player list
                    Enter 3 to search for a player
                    Enter 4 to delete a player""");
            answer = input.nextInt();

            switch(answer){
                case 1:
                    addPlayer(input, playerList);
                    break;
                case 2:
                    System.out.println(playerList);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    if(answer != 0) {
                        System.out.println("Wrong input, try again...");
                    }else{
                        System.out.println("Goodbye!");
                    }
                    break;
            }
        }
    }
    public static void addPlayer(Scanner input, MyLinkedList playerList){
        System.out.println("Enter first name: ");
        String fname = input.next();
        System.out.println("Enter last name: ");
        String lName = input.next();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter team (1 or 2): ");
        int team = input.nextInt();

        MemberPlayer newMember = new MemberPlayer(fname, lName, age, team);

        playerList.addSorted(newMember);

        System.out.println(fname + " " + lName + " have been added to the list");
    }
}