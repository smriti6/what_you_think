public class special {
    public static void main(String[] args) {
        System.out.println("WAP to check if an array of integers contains two specified elements 65 and 77.");
        int n=5,t=0;
        int [] arr={4,5,6,77,8,3};
        boolean b=false;
        for(int i=0;i<n;i++){
            if(arr[i]==65 || arr[i]==77){
                b=true;
                t=i;
            }
        }
        if(b){
            System.out.println("Found at "+t);
        }
        else{
            System.out.println("Not found");
        }

    }
}
