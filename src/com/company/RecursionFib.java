package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(5));

    }



    public static int fib(int orderNumber){
        //1 exit

        if(orderNumber == 0 || orderNumber == 1){
            return 1;
        }
        //2 next step
        return fib(orderNumber - 1) + fib(orderNumber - 2);

    }
}
