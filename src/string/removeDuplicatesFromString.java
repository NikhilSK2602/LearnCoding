package string;
import java.util.*;
public class removeDuplicatesFromString {
    public static void main(String[] args) {
        String in="Sameeksha";
        int n=in.length();
        HashMap<Character,Integer> map=new HashMap<>();
        LinkedHashSet<Character> set= new LinkedHashSet<>();
        for(char ch:in.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)==1){
                set.add(ch);
            }else{
                set.remove(ch);
            }

        }
        StringBuilder result = new StringBuilder();
        for(char ch : set) {
            result.append(ch);
        }
            System.out.println(result.toString());



    }
    }
