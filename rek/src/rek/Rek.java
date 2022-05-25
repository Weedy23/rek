package rek;

public class Rek {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    
    public static int fib(int n) {
        if (n > 2) {
            return fib(n-2) + fib(n-1);
        } else {
            return 1;
        }
    }
}
