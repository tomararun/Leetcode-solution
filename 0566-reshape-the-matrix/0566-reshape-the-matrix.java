class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        //Storing the values of mat matrix
        //i.e m = rows & n = cols
        int rows = mat.length;
        int cols = mat[0].length;
        
        //if the product of rows & cols of mat matrix and the new matrix are not same then return original matrix
        if((rows * cols) != (r * c)) return mat;
        
        //Creating the new matrix
        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;
        
        
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                output[output_rows][output_cols] = mat[i][j];
                output_cols++;
                
                
                if(output_cols == c)
                {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }
        
        return output;
    }
}