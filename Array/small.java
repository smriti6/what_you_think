import java.util.*;
public class small {
    public static void main(String[] args) {
        System.out.println("WAP to find smallest and second smallest elements of a given array.");
        int n[]={5,7,-8,5,14,1};
       // Arrays.sort(n);
        //System.out.println(n[0]+" "+n[1]);
        int s1=101,s2=100;
        for(int i=0;i<n.length;i++){
            //System.out.println(n[i]);
            if(n[i]<s1){
                s2=s1;
                s1=n[i];
            }
            else if(n[i]<s2 && n[i]!=s1){
                s2=n[i];
            }
        }
        System.out.println(s1+" "+s2);
    }
}
