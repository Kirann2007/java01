package DAY3;

public class Animal {
    void eat(){
        System.out.println("cat sleep");
    }
    static class dog extends Animal{
        void bark()
        {
            System.out.println("cat meow");
        }
    }
    static class cat extends dog {
        void meow() {
            System.out.println("cat meow");
        }
    }
    public static void main(String[]args){
        dog d=new dog(); d.eat(); d.bark();
    }
}
