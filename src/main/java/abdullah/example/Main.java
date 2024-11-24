package abdullah.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

//import static abdullah.example.ArrayEasyPrograms.largestElem;
//import static abdullah.example.ArrayEasyPrograms.printMatrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Student s1 = new Student("mamun", 20);
//        Student s2 = new Student("opu", 21);
//        System.out.println(Student.getTotalNumberOfStudent());
//        System.out.println(Student.totalNumberOfStudent);
//
////        Scanner sc = new Scanner(System.in);
////        int age = sc.nextInt();
////        System.out.println(age);
//
//        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");
//        for(String name: names){
//            System.out.println(name);
//        }
//        ArrayEasyPrograms prblm = new ArrayEasyPrograms();

//        int[] arra = {20, 10, 20, 4, 100};
//        int result = largestElem(arra);
//        System.out.println("largest element: " + result);
//        int[][] myArr = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15}
//        };

//        ArrayEasyPrograms.printMatrix(myArr);
//        int[] arr = {3, 4, 5};
//        ArrayEasyPrograms.arrCopy(arr);
//
//        int[] a = { 1, 8, 3 };

// Creating an array b[] of same size as a[]
//        int[] b = new int[a.length];

// Doesn't copy elements of a[] to b[], only makes
// b refer to same location
//        b = a;
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(a));
//        System.out.println(a == b);
//        int[] copiedArr = ArrayEasyPrograms.arrCopy(arr);
//        System.out.println(Arrays.toString(copiedArr));
//        System.out.println(copiedArr == arr);
//        System.out.println(arr + " : " + copiedArr);
//
//        copiedArr[0]++;
//        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(copiedArr));
//
//        boolean isTrue = ArrayEasyPrograms.checkArraysEquals(new int[]{1, 2, 3},new int[]{1, 2, 3});
//        System.out.println(isTrue);

//        int[][] jaggedMatrix = {
//                {1, 2, 3},
//                {4, 5},
//                {6}
//        };
//        int[][] m2 = {
//                {1, 1, 1},
//                {1, 1, 1},
//                {1, 1, 1}
//        };
//        {
//            {1, 2, 3, 4},
//            {2, 3, 4, 5},
//            {3, 4, 5, 6},
//            {4, 5, 6, 7}
//        }


//        int[][] m3 = ArrayEasyPrograms.addMatrix(m, m2, 3);
//        System.out.println(Arrays.deepToString(m3));
//
//        int[][] newArr = ArrayEasyPrograms.transpose(jaggedMatrix);
//
//        for(int[] rows: newArr){
//            System.out.println(Arrays.toString(rows));
//        }
        int[][] squareMatrix = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6, 6, 6, 6},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {8, 8, 8, 8, 8, 8, 8, 8}
        };
        int[][] matrix = {
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 0, 15, 6, 5 },
                { 3, 1, 2, 12 }
        };
//        ArrayAdvancePrograms.printBoundary(squareMatrix);
//        ArrayAdvancePrograms.rotateArray(matrix);

//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//        int newSize = ArrayAdvancePrograms.removeDuplicates(arr);
//
//        for (int i = 0; i < newSize; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4};
//        int[] result = ArrayAdvancePrograms.removeElements(arr, 2);
//        System.out.println(Arrays.toString(result));
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        int[] c1 = ArrayAdvancePrograms.mergeArrays(a1, b1);
        System.out.println(Arrays.toString(c1));

    }
}