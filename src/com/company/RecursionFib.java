package com.company;

public class RecursionFib {

    public static void main(String[] args) {
        System.out.println(fib(19));
        System.out.println(multiply(5, 10));
    }

    public static int fib(int orderNumber){
        //1 exit

        if(orderNumber == 1 || orderNumber == 2){
            return 1;
        }
        //2 next step
        return fib(orderNumber - 1) + fib(orderNumber - 2);
    }

    public static int multiply(int x, int y){
        //1 exit

        if(y == 0){
            return 0;
        }
        if(y == 1){
            return x;
        }
        //2 next step
        return x + multiply(x, y - 1);

    }

}
