package DAY3;

public class stud {
    String name;
    stud(String name){this.name=name;}
    void display(){System.out.println("the student name is "+this.name);}
    public static void main(String[]args)
    {
        new stud("GAYLE").display();
    }
}
