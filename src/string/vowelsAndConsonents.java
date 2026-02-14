package string;
import java.util.*;
public class vowelsAndConsonents {
    public static void main(String[] args) {
        String inp="What are you doing";
        char[]  conv = inp.toLowerCase().toCharArray();
        //String vowel,consonents;
        StringBuilder vowel= new StringBuilder();
        StringBuilder consonents= new StringBuilder();
        for(int i=0;i<conv.length;i++){
            if(conv[i]=='a'||conv[i]=='e'||conv[i]=='i'||conv[i]=='o'||conv[i]=='u'){
                vowel.append(conv[i]);
            }else if(conv[i]!=' '){
                consonents.append(conv[i]);
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonents: " +consonents);
    }
}
