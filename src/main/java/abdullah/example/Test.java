package abdullah.example;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//        for(int i = 0; i < n; i ++){
//            System.out.print(arr[i] + " ");
//        }
//        int[] arr;
//        arr = new int[5];
//        System.out.println(arr[3]);
//        arr[3] = 5;
//        System.out.println(arr[3]);
//        arr[3] = 10;
//        System.out.println(arr[3]);
//        int length = arr.length;
//        System.out.println(length);
//
//        int[] arr2 = new int[10];
//        char[] arr3 = new char[10];
////        System.out.println(arr3[2]);
//        boolean[] arrb = new boolean[10];
//        System.out.println(arrb[2]);
//        double[] arrd = new double[5];
//        System.out.println(arrd[2]);
//        String[] arrs = new String[10];
//        System.out.println(arrs[2]);

//        int[] arr;
//        arr = new int[5];
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("Element at index " + i + " : " + arr[i]);
//        }

//        int[][] arrMul;
//        arrMul = new int[2][];
//
//        for(int i = 0; i < arrMul.length; i++){
//            System.out.println(Arrays.toString(arrMul[i]));
//        }

        int[][] multiDimArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
//        for (int[] ints : multiDimArray) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//        for(int[] ints: multiDimArray){
//            for(int anInt: ints){
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
        int[][] intArray = new int[5][];
        for(int i = 0; i < intArray.length; i ++){
            int temp = (int) (Math.random()*10);
            intArray[i] = new int[temp];
            for(int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = i+j;
            }
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.print("Array " + i + ": " );
            for(int j = 0; j < intArray[i].length; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
