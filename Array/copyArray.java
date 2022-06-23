import java.util.*;

public class copyArray {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        int new_arr []=new int[n];
        for(int i=0;i<n;i++){
            new_arr[i]=arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
        //System.out.println("New Array: "+Arrays.toString(new_arr));
    }
}
