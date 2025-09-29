class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;

        int arr[][]=new int[m][m];
        int k=1;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<m;j++){
                arr[j][m-k]=matrix[i][j];
                
            }
            k++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
    }
}