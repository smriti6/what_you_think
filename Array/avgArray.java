public class avgArray {
    public static void main(String[] args) {
        System.out.println("4. Write a Java program to calculate the average value of array elements ");
        int arr[]={3,4,5,7,9};
        int t=0;
        for(int i=0;i<arr.length;i++){
            t+=arr[i];
        }
        int avg=t/arr.length;
        System.out.println("Average value = "+avg);
        System.out.println("Done");
    }
}
