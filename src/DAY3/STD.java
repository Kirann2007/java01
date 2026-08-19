package DAY3;

public class STD {
    String name;int age;
    STD(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[]args)
    {
        STD d1=new STD("ABD",40);
        System.out.println("the name of the student is "+d1.name);
        System.out.println("the age of the student is "+d1.age);
        STD d2=new STD("Allu arjun",43);
        System.out.println("the name of student is "+d2.name);
        System.out.println("the age of student is "+d2.age);
    }
}
