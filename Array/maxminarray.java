public class maxminarray {
    public static void main(String[] args) {
        System.out.println("max min");

        int n=5;
        int arr[]={43,34,21,44,87};
        int max=00,min=100;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max of array is: "+max);
        System.out.println("Min of array is: "+min);
    }
}
