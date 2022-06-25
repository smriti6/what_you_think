public class equalArray {
    public static void main(String[] args) {
        System.out.println("WAP to test the equality of two arrays.");
        int n1 []={1,2,3,4};
        int n2 []={1,2,3,4};
        boolean b=true;
        for(int i=0;i<3;i++){
            if(n1[i]==n2[i]){
                continue;
            }
            else{
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
