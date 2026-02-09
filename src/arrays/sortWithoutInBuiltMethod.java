package arrays;
import java.util.*;


public class sortWithoutInBuiltMethod {
    public static void main(String[] args) {
        int[] inp={1,5,4,6,2};
        for(int i=0;i<inp.length-1;i++){
            for(int j=0;j<inp.length-1-i;j++){
                if(inp[j]>inp[j+1]){
                    int temp=inp[j];
                    inp[j]=inp[j+1];
                    inp[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(inp));
    }
}
