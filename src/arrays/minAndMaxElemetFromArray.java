package arrays;
import java.util.*;

public class minAndMaxElemetFromArray {
    public static void main(String[] args) {
        int[] inp={1,5,88,44,66,895,10};
        int n=inp.length;
        int maxElement=inp[1];
        int minElement=inp[1];
        for(int i=0;i<n;i++){
            if(inp[i]>maxElement){
                maxElement=inp[i];
            }else if
                (inp[i]<minElement){
                    minElement=inp[i];
            }
        }
        System.out.print(maxElement);
        System.out.print("\n"+ minElement);
    }
}
