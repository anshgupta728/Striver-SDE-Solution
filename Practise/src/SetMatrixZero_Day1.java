public class SetMatrixZero_Day1 {
     static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
    }
    static void setZero(int matrix[][]){
         int r[]=new int[matrix.length];
         int c[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]==0){
                    r[i]=-1;c[j]=-1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i]==-1 || c[j]==-1)
                    matrix[i][j]=0;
            }
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        printMatrix(matrix);
        setZero(matrix);
        printMatrix(matrix);
    }
}
