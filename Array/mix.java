
import java.util.*;
public class mix {
    public static void main(String[] args) {
        System.out.println("min max");
        int n=5;
        int arr []={4,5,62,3,7};
        
        Arrays.sort(arr);
        System.out.println("first array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int arr2[]=new int [n];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            
            arr2[j]=arr[i];
            //System.out.println(arr[i]+" "+j);
            j++;
        }
        System.out.println();
        System.out.println("Second array");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

        int arr3[]=new int [n];
        int e=2,o=3;
        for(int i=0;i<n;i++){
            if(i==0){
                arr3[i]=arr2[i];
            }
            else if(i==1){
                arr3[i]=arr[0];
            }
            else if(i%2!=0){
                arr3[i]=arr[o];
                o++;
            }
            else{
                arr3[i]=arr2[e];
                e++;
            }
        }
        System.out.println();
        System.out.println("ANS");
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
