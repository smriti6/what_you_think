public class indexArray {
    public static void main(String[] args) {
        System.out.println("WAP to find the index of an array element.          ");
        int arr[]={1,2,3,4,5,6};
        int k=4;
        int n=5;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("found at "+i);
            }
        }
    }
}