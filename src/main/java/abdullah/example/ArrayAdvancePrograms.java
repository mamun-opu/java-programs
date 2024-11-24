package abdullah.example;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayAdvancePrograms {
    static int rows = 4;
    static int cols = 4;
    public static void printBoundary(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length-1){
                    System.out.print(arr[i][j]);
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    // i = i, j++


    public static void rotateArray(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        int startRow = 0, startCol = 0;
        int endRow = rows-1;
        int endCol = columns-1;

//        int[][] matrix = {
//                { 5, 6, 7, 8 },
//                { 1, 2, 3, 4 },
//                { 0, 15, 6, 5 },
//                { 3, 1, 2, 12 }
//        };
        printMatrix(arr);
        System.out.println("-------------X-------------");

        while(startRow < endRow && startCol < endCol){
            int previous = arr[startRow+1][startCol];

            //shifting top row
            for(int col = startCol; col <= endCol; col++){
                int current = arr[startRow][col];
                arr[startRow][col] = previous;
                previous = current;
            }
            startRow++;

            //shifting left most column
            for(int row = startRow; row <= endRow; row++){
                int current = arr[row][endCol];
                arr[row][endCol] = previous;
                previous = current;
            }
            endCol--;

            //shifting bottom row
            for(int col = endCol; col >= startCol; col--){
                int current = arr[endRow][col];
                arr[endRow][col] = previous;
                previous = current;
            }
            endRow--;

            //shifting left column
            for(int row = endRow; row >= startRow; row--){
                int current = arr[row][startCol];
                arr[row][startCol] = previous;
                previous = current;
            }
            startCol++;

        }
        printMatrix(arr);
    }
    static void printMatrix(int[][] matrix) {
        for (int[]rows: matrix) {
            for (int elem: rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    static int removeDuplicates(int[] arr) {

       HashSet<Integer> s = new HashSet<>();

       int idx = 0;

       for(int i = 0; i < arr.length; i++){
           if(!s.contains(arr[i])){
               s.add(arr[i]);
               arr[idx++] = arr[i];
           }
       }

       return idx;
    }

    //Remove all occurrences of an element from Array in Java
    public static int[] removeElements(int[] arr, int k){
        int idx = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != k){
                arr[idx++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, idx);
    }

    //Java Program to Merge Two Arrays
    public static int[] mergeArrays(int[]a1, int[]b1){
        int[] c1 = new int[a1.length + b1.length];
        System.arraycopy(a1, 0, c1, 0, a1.length);
        System.arraycopy(b1, 0, c1, a1.length, b1.length);
//        System.out.println(Arrays.toString(c1));
        return c1;

    }
}
