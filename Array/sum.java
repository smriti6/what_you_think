public class sum {
    public static void main(String[] args) {
        System.out.println("pair");
        System.out.println("Find all Pairs of elements in an array whose sum is equal to a specified number");
        int n=5;
        int arr[]={1,2,3,4,5,6};
        int p=5;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==p){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
