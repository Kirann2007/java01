package DAY4;

public class MultipleCatch {
    public static void main (String[]args){
        try{
            int[] number={10,20,30};
            int a=Integer.parseInt("100");
            int b=0;
            System.out.println("the division by"+a/b);
            System.out.println("print the number array"+number[5]);
        }catch(ArithmeticException e )
        {
                System.out.println("the arithmatic exception"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexoutofboundexcetion"+e.getMessage());
        }catch(NumberFormatException e)
        {
            System.out.println("Arithmatic exception"+e.getMessage());
        }
        System.out.println("program exigutes successfully");
    }
}
