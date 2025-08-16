public class Spirals {

    public static void matrixes(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // Right column
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }

            // Bottom row
            // Avoid duplicate row
                for (int i = endCol - 1; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
            

            // Left column
            if (startCol < endCol) { // Avoid duplicate column
                for (int j = endRow - 1; j > startRow; j--) {
                    System.out.print(matrix[j][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        matrixes(matrix);
    }
}
