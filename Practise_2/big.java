public class big {
   public static void main(String args []) 
   {
      int [] t= new int [5];
      int [] [] arr={{1,5,6},
                  {82,7,2},
                  {9,5,3,4},
                  {8,2,64}};
      int x=0;
      for(int i=0;i<arr.length;i++) 
      {
         x=0;
        for(int j=0;j<arr[i].length;j++) 
        {
           x+=arr[i][j];
        }
         t[i]=x;
      }

     for(int i=0;i<arr.length;i++) 
     {
        System.out.println(t[i]);
     }
   }
}


/////////////////
//////////
public class HelloWorld {
   static boolean printChar(char c) {
   System.out.print(c);
   return true;
   }
   public static void main( String[] argv ) {
   int i =0;
   for ( printChar('A'); printChar('B')&&(i<2); printChar('C')){
   i++ ;
   printChar('D');
   }
   }
   }


/////////////
/////////
//////
public static void main(String args[])
{
int i =1,j =10;
do {
 if(i++ > --j) {
  continue;
 }
} while (i <5);
System.out.println("i = " +i+ "and j = "+j);
       
     }

///////////
//////////
int i = 1,j = 10;
do {
 if(i>j) {
  break;
 }
 j--;
} while (++i <5);
System.out.println("i =" +i+" and j = "+j);