package DAY3;

public class animal2 {
    void sound(){System.out.println("Animal sound");}
}
class dog extends animal2{
    @Override void sound(){System.out.println("dog barks");}
}
public class Override1
{
    public static void main(String[]args)
    {
        dog d=new dog();
        d.sound();
        animal2 a=new animal2();
        a.sound();

    }
}