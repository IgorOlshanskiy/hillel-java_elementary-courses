package com.company;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[4] = 100;
//        for (int i = 0; i < a.length; i++){
//            //System.out.println(a[i]);
//        }
//        int[] b = new int[10];
//        for (int i = 0; i < a.length; i++){
//            b[i] = a[i];
//        }
//        a = b;
//
//        int[][] c = new int[10][10];
//        c[4][4] = 10;
//        for (int i = 0; i < c.length; i++){
//            System.out.println(c[i][4]);
//        }
//        int d=100;
        int[][] a = new int[5][5];
//        a[1] = new int[10];
        a[3][4] = 4;
        print1(a);
        print2(a);
    }

    public static void print(int a){
        a = 120;
        System.out.println(a);
    }

    public static void print1(int[][] a){
        for (int i = 0; i < a.length; i++){
            for (int j =0; j < a[i].length; j ++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void print2(int[][] a){
        for (int[] str: a) {
            for (int el : str) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}

