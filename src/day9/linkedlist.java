package day9;

public class linkedlist {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);

        node current=head;

        while(current!=null){
            System.out.print(current.data + "");
            current=current.next;
        }
    }
}
