class big {
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
        System.out.println(arr[i]);
     }
   }
}
