package day11;

public class preorder {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    static void preorder(node root){
        if(root==null)
            return;
        System.out.print(root.data+"");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
        root.left.right=new node(50);
        System.out.print("preoder::");
        preorder(root);
    }
}
