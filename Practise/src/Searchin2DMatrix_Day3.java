public class Searchin2DMatrix_Day3 {
    static boolean searchMatrix(int[][] matrix, int target) {
        //O(n*n)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target)
        //             return true;
        //     }
        // }
        // return false;

        // O(n*logn)
        // for(int i=0;i<matrix.length;i++){
        //     int start=0,end=matrix[0].length-1;
        //     while(start<=end){
        //         int mid=(start+end)/2;
        //         if(matrix[i][mid]==target)
        //             return true;
        //         else if(target<matrix[i][mid])
        //             end=mid-1;
        //         else if(target>matrix[i][mid])
        //             start=mid+1;
        //     }
        // }
        // return false;

        //O(n)
        // int i=0,j=matrix[0].length-1;
        // while(i<matrix.length && j>-1){
        //     if(matrix[i][j]==target)
        //         return true;
        //     else if(target<matrix[i][j])
        //         j--;
        //     else
        //         i++;
        // }
        // return false;

        //O(logn)
        int cols=matrix[0].length,rows=matrix.length;
        int start=0,end=(rows*cols)-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(matrix[mid/cols][mid%cols]==target)
                return true;
            else if(target<matrix[mid/cols][mid%cols])
                end=mid-1;
            else if(target>matrix[mid/cols][mid%cols])
                start=mid+1;
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,11));
        System.out.println(searchMatrix(matrix,13));
        System.out.println(searchMatrix(matrix,23));
    }
}

