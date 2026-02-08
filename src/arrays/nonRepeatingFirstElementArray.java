package arrays;
import java.util.*;
public class nonRepeatingFirstElementArray {
    public static void main(String[] args) {
        int[] inp = {1, 2, 3, 2, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : inp) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i)==1){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        if(set.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(set.iterator().next());
        }

    }
}