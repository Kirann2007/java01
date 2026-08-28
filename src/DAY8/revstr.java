package DAY8;

public class revstr {
    static String reverse(String str){
        if(str.length()==0){
            return"";
        }
        return reverse (str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args){
        String str="RACECAR";
        System.out.println("Reverse="+reverse(str));
    }
}
