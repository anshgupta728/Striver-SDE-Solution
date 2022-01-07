public class RotateMatrix_Day2 {
    static void reverse(int[][] matrix){
        int i=0;
        while(i!=matrix.length){
            int start=0,end=matrix[0].length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;end--;
            }
            i++;
        }
    }
    static void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotate(int matrix[][]){
        transpose(matrix);
        reverse(matrix);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        SetMatrixZero_Day1.printMatrix(matrix);
        rotate(matrix);
        SetMatrixZero_Day1.printMatrix(matrix);
    }
}
