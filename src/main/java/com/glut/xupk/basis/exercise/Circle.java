package com.glut.xupk.basis.exercise;

/**
 * 打印圆
 *
 * @author xupk
 * @create 2018-12-02 13:51
 **/

import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.printCircle();
    }

    private void printCircle(){
        //接收用户输入的半径
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入圆的半径R（大于3的整数）：");
        int r = scan.nextInt();
        for (int y = 0; y <= 2 * r; y += 2) {
            long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
            long longLength = 2 * (r - x);
            for (int i = 0; i <= x; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (double j = 0; j <= longLength; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
