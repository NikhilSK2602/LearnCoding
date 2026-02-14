package string;
import java.util.Arrays;
import java.util.Scanner;
public class reverseStringsAndWords {
    public static void main(String[] args) {
        String name = "Nikhil is working at Netcracker Technology";
        char[] arr = name.toCharArray();
        int first=0, second = name.length()-1;
        while(first<second){
            char temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
            first++;
            second--;
        }
        System.out.println(arr);
    }
}

