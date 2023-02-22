public class Stars {
    public static void main(String[] args) {
        exD(10);
    }

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {

            // print row number
            System.out.printf("%2d: ", row);

            // print stars
            int starCount = rowCount + 1 - row;
            for (int i = 1; i <= starCount; i++) {
                System.out.print('*');
            }

            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                System.out.print('-');
            }

            // new line
            System.out.println();
        }
    }

    public static void exB(int rowCount) {

        // Outer loop for n amount of rows.
        for (int i = 1; i <= rowCount; i++) {

            // prints out row number.
            System.out.printf("%2d: ", i);

            /*
             * rowCount - i is used to calculate the number of rows printed in each row
             * where i is the current row number. In the first row i is 1, therefore
             * i is 9, and 9 dashes is printed out before the star.
             */
            for (int j = 1; j <= rowCount - i; j++) {
                System.out.print("-");
            }

            // here i is to determine how many stars to print out
            // in the first row i is 1 and only prints 1 star.
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exC(int rowCount) {
        for (int i = 1; i <= rowCount; i++) {

            System.out.printf("%2d: ", i);

            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            for (int k = i; k <= rowCount; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exD(int rowcount) {
        int numColumns = 9;

        // Outer loop that iterates over the row number
        // The variable i is used to describe the row number
        for (int i = 0; i < rowcount; i++) {

            // This inner loop iterates over the column number
            // The variable j is used to describe column number
            for (int j = 0; j < numColumns; j++) {

                // Conditional statements to determine whether to print a star or a dash
                // The first if-statement checks if the current row is in the top half of the
                // pattern. (row 1-5), if yes, it after checks if the column index is within
                // the range. If the index is outside the range, a dash is printed.
                // otherwise a star is printed.
                if (i < 5) {
                    if (j < 4 - i || j > 4 + i) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }

                    // For the other half (row 1-6) the second statement will be executed.
                    // It again checks if the index is within the range. If outside, a dash, otherwise
                    // a star.
                } else {
                    if (j < i - 4 || j > numColumns - (i - 5) - 1) {
                        System.out.print("-");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}