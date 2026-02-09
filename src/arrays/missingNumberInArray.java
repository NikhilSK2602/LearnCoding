package arrays;
import java.util.*;



public class missingNumberInArray {
    public static void main(String[] args) {
        int[] inp={1,2,4,5};
        int n=inp.length+1;
        int ans=0;
        for(int i=0;i<inp.length;i++){
            ans+=inp[i];
        }
        int totalSum=n*(n+1)/2;
        int finalValue=totalSum-ans;
        System.out.print(finalValue);
    }
}
