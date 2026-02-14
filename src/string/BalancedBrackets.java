package string;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();
        String inp = "{[(]}";

        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(']', '[');
        pairs.put(')', '(');
        pairs.put('}', '{');

        for (char ch : inp.toCharArray()) {

            if (pairs.containsValue(ch)) {
                s.push(ch);
            }
            else if (pairs.containsKey(ch)) {

                if (s.isEmpty() || s.pop() != pairs.get(ch)) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (s.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
