package arrays;
import java.util.*;


public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        int[] inp={2,3,4,5,6,7,4,1,2,3};
        int index=1;
        if (inp.length == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(inp);
        for(int i=1;i<inp.length;i++){
            if(inp[i]!=inp[i-1]){
                inp[index++]=inp[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(inp,index)));
        System.out.println("Length " + index );
    }
}
