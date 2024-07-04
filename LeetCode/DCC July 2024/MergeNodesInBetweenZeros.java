// You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

// For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

// Return the head of the modified linked list.


// Example 1:

// Input: head = [0,3,1,0,4,5,2,0]
// Output: [4,11]
// Explanation: 
// The above figure represents the given linked list. The modified list contains
// - The sum of the nodes marked in green: 3 + 1 = 4.
// - The sum of the nodes marked in red: 4 + 5 + 2 = 11.


import java.util.*;

// Blue print of creating a new node.
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void printLinkedList(){
        Node curr = this.head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}

public class MergeNodesInBetweenZeros {
    public static Node mergeNodes(Node head) {
        Node modify = head.next;
        Node nextSum = modify;

        while(nextSum != null){
            int sum = 0;
            while(nextSum.val != 0){
                sum += nextSum.val;
                nextSum = nextSum.next;
            }
            modify.val = sum;
            nextSum = nextSum.next;
            modify.next = nextSum;
            modify = modify.next;
        }
        return head.next;
    }
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        // [0,3,1,0,4,5,2,0]
        Node p1 = new Node(0);
        l1.head = p1;
        Node p2 = new Node(3);
        p1.next = p2;
        Node p3 = new Node(1);
        p2.next = p3;
        Node p4 = new Node(0);
        p3.next = p4;
        Node p5 = new Node(4);
        p4.next = p5;
        Node p6 = new Node(5);
        p5.next = p6;
        Node p7 = new Node(2);
        p6.next = p7;
        Node p8 = new Node(0);
        p7.next = p8;

        mergeNodes(l1.head);
        l1.printLinkedList();
    }
}