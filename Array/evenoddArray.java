public class evenoddArray {
    public static void main(String[] args) {
        System.out.println("WAP to find the number of even and odd integers in a given array of integers. ");
        int n=6;
        int arr[]={1,2,3,4,5,6,7};
        int odd=0,even=0;
        for(int i=0;i<=n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even+" "+odd);

    }
}