package arrays;
import java.util.*;
public class searchElementInArray {
    public static void main(String[] args) {
        //int[] inp={1,5,14,566,1552,450};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size\n");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] inp= new int[size];
        for(int i=0;i<size;i++){
            inp[i]=sc.nextInt();
        }
        System.out.print("Enter element to search: \n");
        int n = sc.nextInt();
        boolean found = false;
        //int n=5666;
        for(int i=0;i<inp.length;i++){
            if(inp[i]==n){
                System.out.print("Index:"+" "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("Element not found");
        }
    }
}
