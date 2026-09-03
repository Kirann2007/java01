package day9;

public class delete {

        static class node{
            int data;
            node next;
            node(int data){
                this.data=data;
            }
        }
        static node delete(node head,int value){
            if(head==null)
                return null;
            if(head.data==value)
                return head.next;
            node current=head;
            while(current.next!=null){
                if(current.next.data==value){
                    current.next=current.next.next;
                    break;
                }
                current=current.next;
            }
            return head;
        }
        static void display(node head){
            while(head!=null){
                System.out.println(head.data+" ");
                head=head.next;
            }
        }
        public static void main(String[]args){
            node head=new node(10);
            head.next=new node(20);
            head.next.next=new node(30);
            head.next.next.next=new node(40);
            head=delete(head,20);
            display(head);
        }
    }