package arrays;
import java.util.*;


public class secondHighestElementInArray {
    public static void main(String[] args) {
        int[] arr = {100, 2, 31, 45, 500};
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
        }
        System.out.println(second);
    }
}
