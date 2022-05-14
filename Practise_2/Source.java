import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void sortbyID(String arr[][])
    {
       String ID, name , place;
       boolean sorted= false;
       while(!sorted)
       {
           sorted = true;
           for(int i=0;i<arr.length-1;i++)
           {
               if(Integer.parseInt(arr[i][0])>Integer.parseInt(arr[i+1][0])){
                   sorted=false;
                   
                   ID=arr[i][0];
                   arr[i][0]=arr[i+1][0];
                   arr[i+1][0]=ID;
                   
                   name=arr[i][1];
                   arr[i][1]=arr[i+1][1];
                   arr[i+1][1]=name;
                   
                   place=arr[i][2];
                   arr[i][2]=arr[i+1][2];
                   arr[i+1][2]=place;
               }
           }
           
       }
    }
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	Scanner input=new Scanner(System.in);
	String arr[][]=new String[5][3];
	for(int i=0;i<5;i++)
	{
	    for(int j=0;j<3;j++)
	    {
	        arr[i][j]=input.nextLine();
	    }
	}
    
	sortbyID(arr);
	
	for(int i=0;i<5;i++)
	{
	    for(int j=0;j<3;j++)
	    {
	        System.out.println(arr[i][j]);
	    }
	}
	
	    
	}
}

/////////////////////////////
///////////////////
//////////////
/////////////

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source". // otherwise solution won't be accepted public class Source (

class Source {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String arr[]  = new String[5];

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextLine();
        }

        getToys(arr);
        sc.close();
    }

    public static String[] getToys(String arr[]) {

        Arrays.sort (arr); 
        String revarr[] = new String[arr.length];

        int j = 0;

        for(int i= arr.length-1;i >=0;i--)
        {
            revarr[j] =  arr[i];
        }

        for (int i = 0;i<5;i++)
        {
            System.out.println(revarr[1]);
        }
        return revarr;
    }
}


    