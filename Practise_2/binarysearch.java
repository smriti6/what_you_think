class binarysearch
{
   public static void main (String args []) 
   {
     int arr []={2,4,6,7,8,9};
     int t=2;
     System.out.println(binse(arr,t));
   }
   public static int binse(int [] arr,int target)
   {
        int st = 0;
        int end =arr.length;
        //int mid = start+(end-start)/2;
        int mid= st+end/2;
        while(st<=end) 
        {
            if(target==mid)
                return mid;
            if(target<mid) 
                end=mid-1;
            if(target>mid) 
                st=mid+1;
        }
        return -1;
   }
}
