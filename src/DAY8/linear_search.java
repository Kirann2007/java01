package DAY8;

public class linear_search {
    public static void main(String[] args){
        int[]arr={10,25,7,40,15,23,90,56};
         int target =90;

         for(int i=0;i<arr.length;i++){
             if(arr[i]==target){
                 System.out.println("found at index"+i);
                 return;
             }
         }
         System.out.println("not found");
        }
    }

