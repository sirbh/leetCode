public class Search2D {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        var row = matrix.length;
        var col= matrix[0].length;

        var low = 0;
        var high = (row*col)-1;

        var mid = low+(high-low)/2;
        var midr = mid/col;
        var midc = mid%col;

        while(low<high){
            if(matrix[midr][midc]==target){
                return true;
            }
            else if(matrix[midr][midc]<target){
                low = mid+1;
                mid = low+(high-low)/2;
                midr = mid/col;
                midc = mid%col;
            }
            else {
                high = mid-1;
                mid = low+(high-low)/2;
                midr = mid/col;
                midc = mid%col;
            }
        }

        return false;
    }
}