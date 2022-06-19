import java.util.Scanner;

public class te {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String a=sc.nextLine();
        int n=a.length()-1;
        System.out.println("Reverse");
        for(int i=n;i>=0;i--){
            System.out.print(a.charAt(i));
        }
        
    }
}
