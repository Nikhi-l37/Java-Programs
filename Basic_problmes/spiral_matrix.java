public class spiral_matrix {
    public static void main(String args[])
    {

    int n = 3;
    int[][] matrix = new int[n][n];

    int top = 0;
    int bottom = n-1;
    int left = 0;
    int right = n-1;

    int num = 1;

    while( top<=bottom && left<= right)
    {
        // step 1 fillling the matrix from left to right  (top row)

        for(int i = left; i <= right ; i++)
        {
            matrix[top][i]=num++;

        }

        top++;

        // 2.filling the values from top to bottom (right column)

        for(int i = top ;i<=bottom;i++)
        {
            matrix[i][right] = num++;
        }
        right--;
       
        // 3.filling the values from right to left (bottom row )
        if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                matrix[bottom][i] = num++;
            }
        }
         bottom--;

         // 4.filling the values from bottom to right 

         if(left<=right){
            for(int i=bottom;i>=top;i--){
                matrix[i][left] = num++;
            }
          
         }
           left++;

    }

    for(int i = 0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }









}
}