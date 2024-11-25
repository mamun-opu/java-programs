package abdullah.example;

public class JavaPatternPrograms {
    public static void main(String[] args){

//        pyramid(4);
//        downwardTriangle(4);
        diamondShapeStarPattern(6);

    }
    //************** Java Program to Print left Triangle Star Pattern **************
    public static void leftTriangle(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    //************** Java Program to Print Right Triangle Star Pattern **************
    public static void rightTriangle(int x){
        for(int i = 0; i < x; i++){
//            int z = 1;
            for(int j = x-i-1; j >= 0; j--){
                System.out.print(" ");
            }
            for(int z = 0; z <= i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Java Program to Print Pyramid Number Pattern
    public static void pyramid(int x){
        for(int i = 1; i <= x; i++){
            for(int z = x-i; z > 0; z--){
                System.out.print(" ");
            }
            for(int j = i; j < i*2-1; j++){
                System.out.print(j);
            }
            for(int j = i*2-1; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //Java Program to Print Reverse Pyramid Star Pattern

    public static void reversePyramid(int x){
        for(int i = 0; i < x; i++ ){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = x*2-1; k > 2*i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Java Program to Print Upper Star Triangle Pattern

    public static void upperStarTriangle(int x){
        for(int i = 0; i < x; i++){
            for(int j = x-i-1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//Java Program to Print Mirror Upper Star Triangle Pattern
    public static void mirrorUpperStarTriangle(int x){
        for(int i = 1; i <= x; i++){
            for(int j = x; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < x; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = x; k > i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //Java Program to Print Downward Triangle Star Pattern

    public static void downwardTriangle(int x){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Java Program to Print Diamond Shape Star Pattern
//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//     ***********
//      *********
//       *******
//        *****
//         ***
//          *

    public static void diamondShapeStarPattern(int x){
        for(int i = 1; i < x*2; i++){
            if(i <= x){
                for(int blankSpace = x-1; blankSpace >= i; blankSpace--){
                    System.out.print(" ");
                }
                for(int star = 1; star <= i*2-1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }

            if(i > x){
                for(int blankSpace = 1; blankSpace < i+1 - x; blankSpace++ ){
                    System.out.print(" ");
                }
                //8, 9 , 10
                //(2x-i)*2-1
                //11, 9, 7
                for(int star = 0; star < (2*x-i)*2-1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
