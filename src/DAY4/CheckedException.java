package DAY4;
import java.io.FileReader;
import java.io
        .IDException;
public class CheckedException {
    public static void main(String[]args)
    {
        try {
            FileReader reader = new FileReader("data.txt");
            reader.close();
        } catch (IDException e) {
            System.out.println("checked exception:file problem");
        }
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e){
        System.out.println("unchecked exception:Division by zero");
    }
    }
}
