package com.glut.xupk.basis.exercise;

/**
 * 打印正反三角形
 *
 * @author xupk
 * @create 2018-12-02 11:44
 **/

import java.util.*;

public class Triangle {
    public static void main(String args[]) {
       Triangle triangle = new Triangle();
       triangle.printTriangle();
    }

    private void printTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入行数（单数）：");
        int inputLine = scan.nextInt();
        while (inputLine % 2 != 1 || inputLine > 100){
            System.out.println("输入有误，只能输入1~100之间的单数！请重新输入...\n");
            System.out.println("请输入行数（单数）：");
            inputLine = scan.nextInt();
        }
        inputLine = inputLine + 2;
        ///控制一共有多少行输出（直径）
        for (int i = 0; i < inputLine / 2; i++) {
            for (int k = inputLine - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            //上半部分三角形打印完毕
            System.out.println();
        }
        for (int i = inputLine / 2; i > 0; i--) {
            for (int k = 0; k < inputLine - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            //下半部分三角形打印完毕
            System.out.println();
        }
    }
}
