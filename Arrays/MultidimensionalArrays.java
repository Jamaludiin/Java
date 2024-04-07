package Java.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0][1]);
        System.out.println(myNumbers[1][1]);


        // CHANGING ELEMENTS
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        System.out.println();

        // Loop Through a Multi-Dimensional Array
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
        System.out.println();
          }
        

          
    }
    
}

/*A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces: */