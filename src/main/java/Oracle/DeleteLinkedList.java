package Oracle;

/**
 * Created by prasun.pallav on 3/14/2019.
 */
public class DeleteLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node n = new Node(new_data);
        n.next = head;
        head = n;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public static void main(String args[]) {
        DeleteLinkedList list = new DeleteLinkedList();
        list.push(2);
        list.push(4);
        list.push(5);
        list.push(6);
        list.printList();
        list.deleteNode(4);
        System.out.println();
        list.printList();
    }
}
