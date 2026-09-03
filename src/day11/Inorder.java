package day11;

public class Inorder {
    static class node
    {
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    static void inorder(node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+"  f");
        inorder(root.right);
    }
    public static void main(String[] args){
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
        root.left.right=new node(50);
        System.out.print("inorder:");
        inorder(root);
    }
}
