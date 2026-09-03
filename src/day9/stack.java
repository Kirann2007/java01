package day9;

public class stack {
    static int[]stack=new int[5];
    static int top=-1;
    static void push (int value){
        if(top==stack.length-1){
            System.out.println("stack overflow");
            return;
        }
        stack [++top]=value;
    }
    static int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return-1;
        }
        return stack[top--];
    }
    static int peek(){
        if(top==-1)
            return-1;
        return stack[top];
    }
    public static void main(String[] args){
        push(10);
        push(20);
        push(30);
        push(90);
        push(40);
        push(60);
        System.out.println("top:"+peek());
        System.out.println("pop:"+pop());
        System.out.println("pop:"+pop());
        System.out.println("pop:"+pop());
        System.out.println("pop:"+pop());
        System.out.println("pop:"+pop());
        System.out.println("pop:"+pop());
    }
}
