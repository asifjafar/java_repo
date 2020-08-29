package dailypro;


/**
 * Created by User on 29-08-2020.
 * You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 First List is 7 5 9 4 6
 Second List is 8 4
 Resultant list is 5 0 0 5 6
 */
public class LinkedListAddition {
   private Node head;

    private void pushAtBeginning(int data){
        if(head == null){
            head = new Node(data, null);
        } else {
            head = new Node(data, head);
        }
    }

    private void pushAtEnd(int data){
        if(head == null){
            head = new Node(data, null);
        } else {
            Node tempo = head;
            while(tempo.nextNode!=null){
                tempo = tempo.nextNode;
            }
            tempo.nextNode = new Node(data, null);
        }
    }

    private static void printList(Node list, boolean inReverse){
        if(list==null) return ;

        if(!inReverse){
            System.out.print(list.data);
        }
        printList(list.nextNode, inReverse);

        if(inReverse)
            System.out.print(list.data);
    }

    private static Node summate(Node listA, Node listB) {
        Node result = null;
        int carry = 0, sum;
        while(listA!=null || listB!=null){
            sum = carry + (listA!=null ? listA.data : 0 )  + (listB!=null ? listB.data : 0 );
            carry = sum/10;

            if(result==null) {
                result =  new Node(sum % 10, null);
            } else {
                result = new Node(sum % 10, result);
            }
            if(listA!=null)
                listA = listA.nextNode;
            if(listB!=null)
                listB = listB.nextNode;

        }
        if(carry>0){
            result = new Node(carry,result);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListAddition listA = new LinkedListAddition();
        listA.pushAtEnd(7);
        listA.pushAtEnd(5);
        listA.pushAtEnd(9);
        listA.pushAtEnd(4);
        listA.pushAtEnd(6);

        LinkedListAddition listB = new LinkedListAddition();
        listB.pushAtEnd(8);
        listB.pushAtEnd(4);

        printList(summate(listA.head, listB.head), false);

    }
}

class Node {
    int data;
    Node nextNode;

    Node(int data, Node next){
        this.data = data;
        this.nextNode = next;
    }
}
