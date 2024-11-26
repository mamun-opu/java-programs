package abdullah.example;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEasyPrograms {

    public static void main(String[] args){
//        sortArray();
//        arrSortWithBuiltin();
//        mergeArr();
        sortArrByColumn();
    }

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

    //sorting an array
    public static void sortArray(){
        int[] arr = new int[10];
        for(int i = 0; i <arr.length; i++){
            arr[i] = (int) (Math.random()*100);
        }
        for(int elem: arr){
            System.out.print(elem + ", ");
        }
        System.out.println();

        //56, 26, 29, 86, 29, 10, 22, 89, 7, 87
        //first loop:
        //26, 56, 29, 86, 29, 10, 22, 89, 7, 87
        //7, 56, 29, 86, 29, 26, 22, 89, 10, 87


        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    System.out.println(arr[i]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(arr[i]);
                }
            }
            System.out.print(Arrays.toString(arr));
            System.out.println();
        }
        for(int elem: arr){
            System.out.print(elem + ", ");
        }

    }

    public static void arrSortWithBuiltin(){
        int[] a = {2, -1, 5, 4, 3};
        char[] c = {'b', 'a', 'c', 'b'};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
        Arrays.sort(a);
        Arrays.sort(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
    }
    public static void arrSortReverse(){
        Integer[] a = {2, -1, 5, 4, 3};
        char[] c = {'b', 'a', 'c', 'b'};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

        Arrays.sort(a, Collections.reverseOrder());

    }

    public static void mergeArr(){
        int[] a = { 10, 20, 30, 40 };
        int[] b = { 50, 60, 70, 80 };
        int[] sum = new int[a.length+b.length];

        System.out.println(Arrays.toString(sum));

        sum[0] = 999;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sum));

        System.arraycopy(a, 0, sum, 0, a.length);
        System.arraycopy(b, 0, sum, a.length, b.length);

        System.out.println(Arrays.toString(sum));
    }
    //Sorting a 2D Array according to values in any given column in Java
    public static void sortArrByColumn(){
        int[][] arr = {
                {39, 27, 11, 42},
                {10, 93, 91, 90},
                {54, 78, 56, 89},
                {24, 64, 20, 65}
        };
        int col = 3;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[col-1], b[col-1]));
        for(int[]row: arr){
            System.out.println(Arrays.toString(row));
        }
    }

}
