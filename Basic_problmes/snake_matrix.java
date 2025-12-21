public class snake_matrix {
    public static void main(String args[])
{
    int n = 4;
    int[][] matrix = new int[4][4];
    int count = 1;

    for(int i = 0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            matrix[i][j] = count++;

        }
    }

        System.out.println();


       for(int i = 0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
             System.out.print(matrix[i][j]+" ");
            
            }
            System.out.println();
    }
    
    System.out.println();
    System.out.println("Sanke Matrix");
    System.out.println();

    //int top = 0;
    //int bottom = n-1;
    //int left = 0;
    //int right = n-1;
    //int num = 1;
    //int[][] matrix1 = new int[n][n];

    //while(num<=n*n){

//        for(int i = left ;i<=right;i++)
  //      {
    //        matrix1[top][i] = num++;
  //    }
    //   top++;
//
//         for(int i = right ;i>=left;i--)
   //     {
//            matrix1[top][i] = num++;
//        }
//
//        top++;

//         for(int i = left ;i<=right;i++)
   //      {
    //        matrix1[top][i] = num++;
   //     }
   //     }
    
int num=1;
int[][] matrix1 = new int[n][n];

   for(int i = 0;i<n;i++){

    if(i%2==0)
    {
        for(int j =0;j<n;j++)
        {
            matrix1[i][j]=num++;
        }
    }
    else 
    {
        for(int j=n-1;j>=0;j--)
        {
            matrix1[i][j]=num++;
        }


    }
   }
     
    
    System.out.println();

       for(int i = 0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
             System.out.print(matrix1[i][j]+" ");
            
            }
            System.out.println();
    }

}
}
