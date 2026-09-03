package day11;

public class BST {
    static class node
    {
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        node root=new node(50);
        root.left=new node(30);
        root.right=new node(70);
        root.left.left=new node(20);
        root.left.right=new node(40);
        root.right.left=new node(60);
        root.right.right=new node(80);
        System.out.println("ROOT="+root.data);
    }
}