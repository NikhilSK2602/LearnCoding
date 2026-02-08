package arrays;
import java.util.*;
public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int[] nums={1,2,0,5,0,4,3,0,8};
        if (nums == null|| nums.length==0) {
            return;
        }
        int index =0;
        for(int num:nums){
            if(num!=0){
                nums[index++]=num;
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        System.out.print(Arrays.toString(nums));
    }
}
