

public class MultiDimArrays {

    public static void main(String[] args) {

    }

    /**
    * Set a rectangular portion of a 2-dimensional array to a specific value.
    * Also determine that the parameters passed in are valid and return a boolean
    * indicating this.
    *
    * Inputs: 
    *   matrix:   a 2-dimensional integer array
    *   rowStart: first row to set value in 
    *   rowEnd:   last row to set value in
    *   colStart: first column to set value in
    *   colEnd:   last column to set value in
    *   value:    the value to set the specified elements to
    *
    * Output:
    *   valid:    true if the input parameters were valid
    */
    public static void setRectangle(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd, int value) {
        if (rowEnd < rowStart ||      
            colEnd < colStart ||
            rowStart < 0 || 
            rowEnd >= matrix.length ||
            colStart < 0 ||
            colEnd >= matrix[0].length) {
            return false;
        }
        
        // Now we know parameters are valid
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; i < matrix[i].length; j++) {
                if ((i >= rowStart && i <= rowEnd) && (j >= colStart && j <= colEnd)) {
                    matrix[i][j] = value;
                }
            }
        }

        return true;
    }
}
