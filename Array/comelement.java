public class comelement {
    public static void main(String[] args) {
        System.out.println("WAP to find the common elements between two arrays of integers.  ");

        int n1 []={1,2,3,4,5};
        int n2[]={2,46,6,53,3};
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(n1[i]==n2[j]){
                    System.out.println("found at "+i+" "+j);
                }
            }
        }
    }
}
