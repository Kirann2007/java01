package DAY4;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Finally {
    public static void main(String[]args)
    {
        Scanner filescanner=null;
        try{
                File file=new File("src/DAY4/data.txt");
                System.out.println(file.getAbsolutePath());
                filescanner=new Scanner(file);
                System.out.println("\nfile content:");
                while(filescanner.hasNext())
                {
                    System.out.println(filescanner.nextLine());
                }
        }catch(FileNotFoundException e)
        {
            System.out.println("Exception *"+e);
        }finally{
            if(filescanner !=null) {
                filescanner.close();
                System.out.println("\nclosed file successfully");
            }
        }
    }

}
