package day9;

public class class2 {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    static node insertAtBeginning(node head, int value) {
        node newnode = new node(value);
        newnode.next = head;
        head = newnode;
        return head;
    }

    static void display(node head) {
        node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);

        head = insertAtBeginning(head, 5);
        display(head);






    }
}


