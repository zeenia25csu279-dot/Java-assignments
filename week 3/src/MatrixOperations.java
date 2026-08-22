public class MatrixOperations {

    public static void main(String[] args) {

        int[][] first = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] second = {
            {7, 8, 9},
            {10, 11, 12}
        };


        System.out.println("First matrix:");
        printMatrix(first);


        System.out.println("Row sums:");

        int[] rows = rowSums(first);

        for (int i = 0; i < rows.length; i++) {
            System.out.print(rows[i] + " ");
        }

        System.out.println();


        System.out.println("Column sums:");

        int[] columns = columnSums(first);

        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " ");
        }

        System.out.println();


        System.out.println("Addition:");

        int[][] added = add(first, second);
        printMatrix(added);


        System.out.println("Transpose:");

        int[][] transposed = transpose(first);
        printMatrix(transposed);


        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        System.out.println("Multiplication:");

        int[][] multiplied = multiply(a, b);
        printMatrix(multiplied);
    }


    static int[] rowSums(int[][] matrix) {

        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                sum = sum + matrix[i][j];
            }

            result[i] = sum;
        }

        return result;
    }


    static int[] columnSums(int[][] matrix) {

        int[] result = new int[matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {

                sum = sum + matrix[i][j];
            }

            result[j] = sum;
        }

        return result;
    }


    static int[][] add(int[][] first, int[][] second) {

        if (first.length != second.length ||
            first[0].length != second[0].length) {

            throw new IllegalArgumentException(
                "Dimensions do not match"
            );
        }

        int[][] result =
            new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < first[i].length; j++) {

                result[i][j] =
                    first[i][j] + second[i][j];
            }
        }

        return result;
    }


    static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }


    static int[][] multiply(int[][] first, int[][] second) {

        if (first[0].length != second.length) {

            throw new IllegalArgumentException(
                "Dimensions are not valid for multiplication"
            );
        }

        int[][] result =
            new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second[0].length; j++) {

                for (int k = 0; k < first[0].length; k++) {

                    result[i][j] =
                        result[i][j]
                        + first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }


    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}