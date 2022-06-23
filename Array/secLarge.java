import java.util.*;
public class secLarge {
    public static void main(String[] args) {
        System.out.println("Write a Java program to find the second largest element in an array");
        int arr []={23,53,573,23,786,533,4778};
        Arrays.sort(arr);
        //System.out.println(arr.length);

        System.out.println(arr[arr.length-2]);

    }
}
