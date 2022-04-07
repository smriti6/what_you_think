 for(int i=0;i<nums.length;i++)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(i==j || i+j==nums.length-1)
                    // sum+=nums[i][j];
                    System.out.print(nums[i][j]);
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        