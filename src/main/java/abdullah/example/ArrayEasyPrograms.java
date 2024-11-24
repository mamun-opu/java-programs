package abdullah.example;

import java.util.Arrays;

public class ArrayEasyPrograms {
    public static int largestElem(int[] arr){
        int largest = arr[0];
        for(int temp: arr){
            if(largest < temp){
                largest = temp;
            }
        }
        return largest;
    }
    public static void printMatrix(int[][] arr){
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        //using for each loop
//        for(int[] row: arr){
//            for(int elem: row){
//                System.out.print(elem + " ");
//            }
//        }
        //using Arrays.toString()
//        for(int[] row: arr){
//            System.out.print(Arrays.toString(row) + ", ");
//        }
        //using Arrays.deepToString()
        System.out.println(Arrays.deepToString(arr));
    }

    public static int[] arrCopy(int[] arr){
//        int[] arr2 = new int[arr.length];
//        arr2 = arr;
//        System.out.println(Arrays.toString(arr2));

//        int[] copiedArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            copiedArr[i] = arr[i];
//        }
        int[] arr2 = new int[arr.length];
        arr2 = Arrays.copyOf(arr, arr.length);
        return arr2;
    }
//Java Program to Check if two Arrays are Equal or not************
    public static boolean checkArraysEquals(int[] arr, int[] arr2){
        return Arrays.equals(arr, arr2);

    }
    // Java Program for Addition of Two Matrices
    public static int[][] addMatrix(int[][] arr, int[][] arr2, int size){
        int[][]arr3 = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }
    //Java Program to Find Transpose of Matrix

    public static int[][] transpose(int[][] arr){

        //transpose array creation ---------------------------->>>>>>>>>
        int lergestRow = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length > lergestRow){
                lergestRow = arr[i].length;
            }
        }
        int[][] transposeArr = new int[lergestRow][arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //transpose array creation ---------------------------->>>>>>>>>

//        for(int i = 0; i < transposeArr.length; i++){
//            for(int j = 0; j < transposeArr[0].length; j++){
//                transposeArr[i][j] = arr[j][i];
//            }
//        }

        return arr;
    }

}
