package abdullah.example;

import java.util.Scanner;

public class BasicJavaPrograms {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        double result = multiply();
//        System.out.printf("the multiplication is: %.2f", result);
//        swapValuesWithoutUsingThirdVariable();

//        String result = addTwoBinaries();
//        System.out.println(result);

//        ComplexNumber c = new ComplexNumber(5, 6);
//        ComplexNumber d = new ComplexNumber(2, 4);
//
//        ComplexNumber res = addComplexNumber(c, d);
//        res.show();

//        int rs = LCM(15, 25);
//        System.out.println(rs);
//        getPrime(10);
//        isLeapYear(2012);

//        armstrongNum(50, 500);
//        isNeon(8);
//        System.out.println(factorialOf(5));

        System.out.println(fibonacci(7));

    }
//    Java Program to Multiply two Floating-Point Numbers
    public static double multiply(){
        System.out.print("a: ");
        float a = sc.nextFloat();

        System.out.print("b: ");
        float b = sc. nextFloat();
        return a*b;
    }

    public static void swapValuesWithoutUsingThirdVariable(){
        int a, b;

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        a = (a + b); //8
        b = a - b; // 5;
        a = a - b;

        System.out.println("a: " + a + ", b: " + b);
    }

//    Java Program to Add Two Binary Strings

    public static String addTwoBinaries(){
        System.out.print("First string: ");
        String x = sc.nextLine();
        System.out.print("Second string: ");
        String y = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int i = x.length()-1;
        int j = x.length()-1;
        int carry = 0;
        int sum = 0;

        while(i >= 0 || j >= 0){

            sum = carry;
            if(i >= 0){
                sum += x.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += y.charAt(j) - '0';
                j--;
            }
            if(sum == 0 || sum == 1){
                result.append(sum);
            } else if (sum == 2) {
                result.append(0);
                carry = 1;
            }else{
                result.append(1);
                carry = 1;
            }
        }
        if(carry == 1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
    //Java Program to Add two Complex Numbers
    public static ComplexNumber addComplexNumber(ComplexNumber a, ComplexNumber b){
        int real = a.getReal() + b.getReal();
        int image = a.getImaginary() + b.getImaginary();
        ComplexNumber res = new ComplexNumber(real, image);

        return res;
    }
//
//    Java Program to Find the LCM of Two Numbers
    public static int LCM(int a, int b){
        int l = Math.max(a, b);
        int s = Math.min(a, b);

        int lcm = l;
        int i = 1;

        while( lcm % s != 0 ){
            lcm = l * i;
            i++;
        }
        return lcm;
    }

    //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    public static void getPrime(int x){

        boolean[] isPrime = new boolean[x+1];
        for(int i = 2; i <= x; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i*i <= x; i++ ){
            if(isPrime[i]){
                for(int j = i*i; j <= x; j+= i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 0; i <= x; i++){
            if(isPrime[i]){
                System.out.println(i + ", ");
            }
        }
    }

    public static void isLeapYear(int x){
        if((x % 100 == 0 && x % 400 == 0) || x % 4 == 0){
            System.out.println(x + " is a leap year!");
        }else {
            System.out.println(x + " is not a leap year!");
        }
    }

    //Java Program to Check Armstrong Number between Two Integers

    public static void armstrongNum(int x, int y){
        for(int i = x; i <= y; i++){
            int num = i, n = 0;
            while(num != 0){
                num = num / 10;
                n++;
            }
            num = i;
            int sum = 0;
            while(num != 0){
                int d = num % 10;
                sum += (int) Math.pow(d, n);
                num = num / 10;
            }
            if(sum == i){
                System.out.println(i + " is a armstrong number!");
            }
        }
    }

    //Java Program to Check If a Number is Neon Number or Not
    public static void isNeon(int x){
        int y = x*x;
        int sum = 0;
        while(y != 0){
            sum += y%10;
            y = y/10;
        }
        if(sum == x){
            System.out.println(x + " is a neon number");
        }else{
            System.out.println(x + " is not a neon number");
        }
    }
    //factorial
    public static int factorialOf(int x){
        if(x == 1 || x == 0){
            return 1;
        }else return x*factorialOf(x-1);
    }

    //Fibonacci
    public static int fibonacci(int x){
        int sum = 0;
        if(x <= 0)return 0;
        int[] fib = new int[x*2+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= x*2; i++){
            fib[i] = fib[i-1]+fib[i-2];
            if(i % 2 == 0){
                sum += fib[i];
            }
        }

        return sum;
    }


}
