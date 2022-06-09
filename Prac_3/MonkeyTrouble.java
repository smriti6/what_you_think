import java.util.Scanner;
import java.util.Arrays;
public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("start");
        // boolean a=sc.nextBoolean();
        // boolean b=sc.nextBoolean();
        // boolean t=isTrouble(a, b);
        // System.out.println(t);


        //Scanner sc = new Scanner(System.in);
        
        //Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n<1 || n>20)
		{
			System.out.println("INVALID_INPUT");
		}
		else
		{
		    int ages[]=new int[n];
		
		    for(int i=0;i<n;i++)
		    {
		        ages[i]=sc.nextInt();	
		    }
		
		    Arrays.sort(ages);
		
		    int min = ages[0];
		    int max = ages[n-1];
		
		    System.out.println("MIN=" + min);
		    System.out.println("MAX=" + max);
		}
	



    }
    // static boolean isTrouble(boolean aSmile, boolean bSmile)
    // {
    //     if(aSmile==bSmile)
    //     {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
}
