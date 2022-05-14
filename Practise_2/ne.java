public class ne {
    
}
import java.util.Scanner;

class User{
    private int cusId;
    private String name;
    private String city;

    User(){
        super();
    }

    public User(int cusId, String name, String city){
        this.cusId = cusId;
        this.name = name;
        this.city = city;
    }
    //for cusId
    public int getCusId(){
        return cusId;
    }
    public void setCusId(int cusId){
        this.cusId = cusId;
    }

    //for name
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    //for city
    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

}
public class LSAByUserId {
    public static void main(String[] args) {
        int key,loc,n;
        Scanner sc = new Scanner(System.in);
        User[] cus = new User[5];
        cus[0] = new User(1204, "Gaurav", "Delhi");
        cus[1] = new User(1205, "Deepak", "Noida");
        cus[2] = new User(1206, "Arjun", "Pune");
        cus[3] = new User(1207, "Asha", "Mumbai");
        cus[4] = new User(1208, "Chinmay", "Pimpri");
        
        n=cus.length;
        System.out.println("Enter User ID to be searched: ");
        key = sc.nextInt();
        loc = linearSearch(cus, n, key);

        if(loc==-1)
        {
            System.out.println("No Record Found");
        }
        else{
            System.out.println("Record Found:");
            System.out.println("CusID\t\tName\t\tCity");
            System.out.println(cus[loc].getCusId()+"\t\t"+cus[loc].getName()+"\t\t"+cus[loc].getCity());
        }
        sc.close();
    }
        //linear search method
        static int linearSearch(User c[], int n, int key){
            for(int i=0;i<n;i++)
            {
                if(c[i].getCusId() == key)
                {
                    return i;
                }
            }
            return -1;
        }
}
/*Output:
Test Case 1:
Enter User ID to be searched:
1204
Record Found:
CusID           Name            City
1204            Gaurav          Delhi

Test Case 2:
Enter User ID to be searched:
1205
Record Found:
CusID           Name            City
1205            Deepak          Noida

Test Case 3:
Enter User ID to be searched:
1208
Record Found:
CusID           Name            City
1208            Chinmay         Pimpri

Test Case 4:
Enter User ID to be searched:
1234
No Record Found
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",

// otherwise solution won't be accepted

public class Source {
    static String User [] []=new String[5][3]; 
    
    Source() {

    User[0][0]="11";
    User [0][1]="Speeding Cars";
    User[0][2]="350";

    User [1][0] ="31";
    User [1][1]="Snake And Ladder";
    User[1][0]="200";

    User[2][0]="29";
    User [2][1]="Ludo";
    User[2][2]="450";

    User [3][0]="17";
    User[3][1]="Donald Duck"; 
    User [3][2] ="600";

    User [4][0]="56"; 
    User [4][1] ="Racing Bike";
    User[4][2] ="350";
    }

    public static void main(String args[]) throws Exception { 
        // Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Scanner sc = new Scanner(System.in); 
        String input = sc.nextLine();

        Source obj= new Source(); 
        int check= 1;
        
        for(int i = 0; i < 5; i++)
        {
            if(obj.User[i][1].equals(input))
            {   
                System.out.println(obj.User[i][0]);
                System.out.println(obj.User[i][1]);
                System.out.println(obj.User[i][2]);
                check =1;
                break;
            }
            else
            {
                check = 0;
            }
        }
        if(check==0)
        {
            System.out.println("No Record Found");
        }
        sc.close();
    }
}





///////////////////////////////////////////////////////////////////////////////
////////////////////////////////////
///////////////////////////////


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
  public static String[] getUser(String name){ 
  String UserDetails[][]=new String[5][3];
	UserDetails[0][0]="1001";
	UserDetails[0][1]="Raj";
	UserDetails[0][2]="Chennai";
	
	UserDetails[1][0]="1008";
	UserDetails[1][1]="Akshay";
	UserDetails[1][0]="Pune";
	
	UserDetails[2][0]="1002";
	UserDetails[2][1]="Simrath";
	UserDetails[2][2]="Amristar";
	
	UserDetails[3][0]="1204";
	UserDetails[3][1]="Gaurav";
	UserDetails[3][2]="Delhi";
	
	UserDetails[4][0]="1005";
	UserDetails[4][1]="Ganesh";
	UserDetails[4][2]="Chennai";
	
	
	 for (String cust[] : UserDetails) {
         if (cust[1].equals(name)) {
            return cust;
         }
      }
      return null;
	
	
  }
  
	public static void main(String args[] ) throws Exception {
	    
	    Scanner input=new Scanner(System.in);
	    String name=input.nextLine();
	    String User[]=getUser(name);
	    if(User!=null)
	    {
	      System.out.print(User[0]+"\n"+User[1]+"\n"+User[2]);  
	    }
	    else{
	    System.out.print("No Record Found");
	    }
	    
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}

    /////////////////////////////
    /////////////////////
    ////////////////////
    //////////////////////


    import java.util.*;
public class Source {
    // Binary Search not possible for given input
    // Since given data has repeated values for "Chennai"
    // Will update the code once this is fixed
    static String UserDetails[][]=new String[5][3];
    Source()
    {
        UserDetails[0][0]="1001";
        UserDetails[0][1]="Raj";
        UserDetails[0][2]="Chennai";
        
        UserDetails[1][0]="1008";
        UserDetails[1][1]="Akshay";
        UserDetails[1][2]="Pune";
        
        UserDetails[2][0]="1002";
        UserDetails[2][1]="Simran";
        UserDetails[2][2]="Amritsar";
        
        UserDetails[3][0]="1204";
        UserDetails[3][1]="Gaurav";
        UserDetails[3][2]="Delhi";
        
        UserDetails[4][0]="1005";
        UserDetails[4][1]="Ganesh";
        UserDetails[4][2]="Chennai";
    }
	
	public static void main(String args[] ) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    Source o = new Source();
	    String key = sc.nextLine();
		boolean flag = false;
		for(int i=0; i<UserDetails.length; i++)
		{
		    if(UserDetails[i][2].equalsIgnoreCase(key))
		    {
			for(int j=0; j<3; j++)
			{
			    System.out.println(UserDetails[i][j]);
			    flag = true;
			}
		    }
		}
		if(!flag)
		{
		    System.out.println("No Record Found");
		}
	}
	}   







    ////////////////////////
    ///////////////////
    ////////////////////
    ////////////////////////////
    /////////////////

    import java.util.Scanner;

    class User{
        private int userId;
        private String emailId;
        private String password;
        private String firstName;
        private String lastName;
        private String city;
        private String gender;
        private int phoneNumber;
    
        public  User(){
            super();
        }
    
        public User(int userId, String emailId, String password, String firstName, String lastName, String city, String gender, int phoneNumber){
            this.userId = userId;
            this.emailId = emailId;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
        }
    
        @Override
        public String toString(){
    
            return "User[userId="+userId+",emaiID="+emailId+",password="+password+",firstName="+firstName+",lastName"+lastName+",city="+city+",gender="+gender+",phoneNumber="+phoneNumber+"]";
    
        }
    
    }
    
    public class UserByCity {
    
    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
    
            String input= scan.next();
            switch(input.toLowerCase()){
    
                case "bangalore": getBangalore();
                                    break;
    
                case "chennai": getChennai();
                                break;
                
                case "delhi":  getDelhi();
                                break;
    
                default:    System.out.println("No City Found");
            }
    
            scan.close();
        }
    
    
        public static void getBangalore(){
            User bangalore = new User(1001, "abc1@gmail.com","password1", "Harry", "Potter","Bangalore", "male", 1234567892);
            System.out.println(bangalore);
        }
    
        public static void getChennai(){
            User Chennai = new User(1002, "abc12@gmail.com","password2", "Raj", "Kumar","Chennai", "male", 1254567892);
            System.out.println(Chennai);
        }
    
        public static void getDelhi(){
            User delhi = new User(1003, "abc13@gmail.com","password3", "Sneha", "dip","Delhi", "male", 1234560892);
            System.out.println(delhi);
        }
        
    }
    


    /////////////////////
    /////////////
    /////////////
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;
    
    // Class name should be "Source",
    
    // otherwise solution won't be accepted
    
    public class Source {
        static String toyDetails [] []=new String[5][3]; 
        
        Source() {
    
        toyDetails[0][0]="11";
        toyDetails [0][1]="Speeding Cars";
        toyDetails[0][2]="350";
    
        toyDetails [1][0] ="31";
        toyDetails [1][1]="Snake And Ladder";
        toyDetails[1][0]="200";
    
        toyDetails[2][0]="29";
        toyDetails [2][1]="Ludo";
        toyDetails[2][2]="450";
    
        toyDetails [3][0]="17";
        toyDetails[3][1]="Donald Duck"; 
        toyDetails [3][2] ="600";
    
        toyDetails [4][0]="56"; 
        toyDetails [4][1] ="Racing Bike";
        toyDetails[4][2] ="350";
        }
    
        public static void main(String args[]) throws Exception { 
            // Enter your code here. Read input from STDIN. Print output to STDOUT. 
            Scanner sc = new Scanner(System.in); 
            String input = sc.nextLine();
    
            Source obj= new Source(); 
            int check= 1;
            
            for(int i = 0; i < 5; i++)
            {
                if(obj.toyDetails[i][1].equals(input))
                {   
                    System.out.println(obj.toyDetails[i][0]);
                    System.out.println(obj.toyDetails[i][1]);
                    System.out.println(obj.toyDetails[i][2]);
                    check =1;
                    break;
                }
                else
                {
                    check = 0;
                }
            }
            if(check==0)
            {
                System.out.println("No Record Found");
            }
            sc.close();
        }
    }
    