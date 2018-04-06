public class MultiDimArrays {

    public static void main(String[] args) {
        System.out.println("Valid:");
        int[][] matrix = new int[10][10];
        setRectangle(matrix, 0, 2, 0, 2, 9);
        printMatrix(matrix);

        System.out.println("Also Valid (specify whole matrix)");
        int[][] matrix4 = new int[10][10];
        setRectangle(matrix4, 0, 9, 0, 9, 9);
        printMatrix(matrix4);
 
        System.out.println("Invalid because rowStart == -1 (so nothing happens)");
        int[][] matrix2 = new int[10][10];
        setRectangle(matrix2, -1, 2, 0, 2, 9);
        printMatrix(matrix2);

        System.out.println("Invalid because colEnd < colStart (so nothing happens again)");
        int[][] matrix3 = new int[10][10];
        setRectangle(matrix3, 0, 2, 5, 4, 9);
        printMatrix(matrix3);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
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
    public static boolean setRectangle(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd, int value) {
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
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i >= rowStart && i <= rowEnd) && (j >= colStart && j <= colEnd)) {
                    matrix[i][j] = value;
                }
            }
        }

        return true;
    }
}
