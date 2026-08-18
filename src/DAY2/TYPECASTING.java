package DAY2;

public class TYPECASTING {
    public static void main(String[] args)
    {
        int number=100;

        double value=number;
        System.out.println(value);
        double price=99.99;
        System.out.println("the round off"+Math.round(price));

        int converted=(int) price;
        System.out.println(converted);
    }
}
