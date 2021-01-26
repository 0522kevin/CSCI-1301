public class FindTheSums {
    //method to print out the arrays in a form of String
    public static String arrayToString(int[][] a) {
        //creates the string that will be returned
        String toBeReturned = "";

        //uses a nested for loop to access each individual indices
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                //if j is not the end of the column
                if(j != a[0].length - 1) {
                    //include a space after each number
                    toBeReturned = toBeReturned + a[i][j] + " ";
                }
                else {
                    //skip to next line after the number
                    toBeReturned = toBeReturned +  a[i][j];
                }
            }
            if(i != a.length - 1) {
                toBeReturned = toBeReturned + "\n";
            }
        }

        //returns the formatted string
        return toBeReturned;
    }

    //method to find the horizontal sums
    public static int[][] horizontalSums(int[][] a, int sumToFind) {
        //creates b[][] that has the same dimensions as a[][]
        int[][] b = new int [a.length][a[0].length];

        //creates local variables needed for this method
        int tempSum;
        int indexCount;

        //uses nested for loop to access each indices
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                //initialize the variables
                tempSum = 0;
                indexCount = 0;

                //uses another for loop for each element
                //will go around the columns on the same row
                for(int x = 0; x < a[0].length - j; x++) {
                    //adds the elements together
                    tempSum += a[i][j + x];
                    //increases index count that will be needed to store the needed values to b[][]
                    indexCount++;

                    //if we find the numbers that are needed to be stored
                    if(tempSum == sumToFind) {
                        for(int y = 0; y < indexCount; y++) {
                            //stores the vales in a[][] to b[][]
                            b[i][j + x - y] = a[i][j + x - y];
                        }
                        //ends the for loop so the program will move on to the next column to compare
                        x = a[0].length;
                    }

                    if(tempSum > sumToFind) {
                        x = a[0].length;
                    }
                }
            }
        }

        return b;
    }

    //method to find the vertical sums
    public static int[][] verticalSums(int[][] a, int sumToFind) {
        //this method works exactly like horizontalSums()

        //creates b[][] that has the same dimensions as a[][]
        int [][] b = new int [a.length][a[0].length];

        //creates the local variables that are needed for this lab
        int tempSum;
        int indexCount;

        //uses nested for loop to access each indices
        //however, the order of for loop is switched because we need to compare the elements each column
        for(int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a.length; j++) {
                //initializes the variables
                tempSum = 0;
                indexCount = 0;

                //uses another for loop for each index
                for(int x = 0; x < a.length - j; x++) {
                    //adds the elements in the same column this time, not row
                    tempSum += a[j + x][i];
                    //increases indexCount by one
                    indexCount++;

                    //if we found the elements we need to store
                    if(tempSum == sumToFind) {
                        //uses for loop to store the numbers
                        for(int y = 0; y < indexCount; y++) {
                            b[j + x - y][i] = a[j + x - y][i];
                        }
                        //ends the for loop
                        x = a.length;
                    }

                    //if the index is not what we're looking for, ends for loop
                    if(tempSum > sumToFind) {
                        x = a.length;
                    }
                }
            }
        }

        return b;
    }
}
