package main;

public class MyMain {
    public static void main(String[] args) {
        System.out.println(factorial(17));
        System.out.println(Integer.MAX_VALUE + "<---- max value of int");
    }
    private static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
