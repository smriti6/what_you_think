public class arr {
    public static void main(String[] args) {
        int ar[][]={{1,2},{3,4},{5,6}};
        
        for(int i=0;i<ar.length;i++)
        {
           
            for(int j=0;j<ar.length-1;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
