class Solution {
public void setZeroes(int[][] matrix) {
    // row -> matrix[...][j]
    // col -> matrix[i][...]
    int col0 =1;
    int n = matrix.length;
    int m = matrix[0].length;
    for(int i =0 ;i<n ; i++){
        for(int j =0 ;j<m ; j++){
            if(matrix[i][j] == 0){
                //mark the j-th col
                if(j !=0 )
                    matrix[0][j] =0;
                else
                    col0 =0;
                // mark the i-th row 
                matrix[i][0] = 0;
            }
        }
    }
    // reiterate with leaving row and col 
    for(int i =1; i<n ; i++){
        for(int j =1 ; j<m; j++){
            if(matrix[i][j] != 0){
                //check for row and col 
                if(matrix[0][j] == 0 || matrix[i][0] ==0 ){
                    matrix[i][j] =0;
                }
            }
        }
    }
    if(matrix[0][0] ==0 ){
        for(int j =0 ; j<m ; j++){
            matrix[0][j] =0;
        }
    }
    if(col0 ==0 ){
        for(int i =0 ; i<n ; i++){
            matrix[i][0] =0;
        }
    }
}
}
