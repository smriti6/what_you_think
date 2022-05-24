import java.util.Arrays;
import java.util.Scanner;

class user {
    public static void main(String[] args) {
        System.out.println("Create a program to accept 5 user name & show in accending order");
        //System.out.println(userName());
        userName();
    }

    public static void userName()
    {
        Scanner sc=new Scanner(System.in);
        String [] name=new String [5];

        for(int i=0;i<5;i++)
        {
            name[i]=sc.nextLine();
        }
        
        Arrays.sort(name);
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }
    }


    //reverse the user name e.g a,b,c,d,e output e,d,c,b,a

    // Scanner sc = new Scanner(System.in);
    //     String arr[]  = new String[5];

    //     for(int i=0;i<5;i++)
    //     {
    //         arr[i] = sc.nextLine();
    //     }

    //     getToys(arr);
    //     //sc.close();
    // }

    // public static void getToys(String arr[]) {

    //     Arrays.sort (arr); 
    //     String revarr[] = new String[arr.length];

    //     int j = 0;

    //     for(int i= arr.length-1;i >=0;i--)
    //     {
    //         revarr[j] =  arr[i];
    //         j++;
    //     }

    //     for (int i = 0;i<5;i++)
    //     {
    //         System.out.println(revarr[i]);
    //     }
        // return revarr;
    
    //}
}