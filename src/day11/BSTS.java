package day11;

public class BSTS {
    static class node
    {
        int data;
        node left;
       node right;

        node(int data){
            this.data=data;
        }
    }
    static boolean search(node root,int target){
        if(root==null)
            return false;

        if(root.data==target)
            return true;

        if(target<root.data)
            return search(root.left,target);

            return search(root.right,target);
    }
    public static void main(String[] args){
        node root=new node(50);
        root.left=new node(30);
        root.right=new node(70);
        root.left.left=new node(20);
        root.left.right=new node(40);
        root.right.left=new node(60);
        root.right.right=new node(80);
        int target=90;
        if(search(root,target))
            System.out.println("element found");
        else
            System.out.println("element not found");
    }
}
