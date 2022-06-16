import java.util.Scanner;
public class delrep {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char[] a = new char[4];
        //Accepting input
        System.out.println("Enter characters:");
        for(int i=0;i<4;i++)
        {
            a[i] = sc.next().charAt(0);
        }

        //Displaying array before deleting 
        System.out.println("Array Before Deleting duplicates:");
        for(int i=0;i<4;i++)
        {
            System.out.println("a["+i+"] = "+a[i]); 
        }
        System.out.println("Size = "+a.length);

        //Displaying array after deleting 
        int size=deleteRepeats(a);
        System.out.println("Size = "+size);
        sc.close();
    }
    static int deleteRepeats(char arr[])
    {
        //ArrayList<Character> b = new ArrayList<Character>();
        int n = arr.length;
        int index = 0;
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    break;
                }
                else{
                    System.out.println(arr[i]);
                }
            }
            if(j==i)
            {
                arr[index++]=arr[i];
                System.out.println("\na["+i+"] = "+arr[i]);
            }
        }
        //Displaying array after deleting j
        int size = arr.length;
        System.out.println(size);
        System.out.println("Array After Deleting duplicates:");
        for(int i=0;i<size;i++)
        {
            System.out.println("a["+i+"] = "+arr[i]); 
        }
        return size;
    }
}


        /*
            flag=0;
            for(int k=0;k<arr.length;k++)
            {
                if(arr[i]!=arr[k])
                { 
                    flag=1;
                }
            }
            //if at the end 2nd for loop, flag is equal to 1, then it means that ith charchter
            //should be stored in b once only
            if(flag==1)
            {
                b.add(arr[i]);
            }
            */