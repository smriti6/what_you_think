import java.util.Arrays;

public class diff {
    public static void main(String[] args) {
        System.out.println(" WAP to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.");
        int n=5;
        int arr[]={6,5,73,63,6,2};
        Arrays.sort(arr);
        int diff=arr[5]-arr[0];
        System.out.println(diff);

    }
}
