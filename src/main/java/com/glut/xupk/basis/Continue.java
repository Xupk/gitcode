package com.glut.xupk.basis;

/**
 * continue示例用法
 *
 * @author xupk
 * @create 2018-12-01 23:15
 **/
public class Continue {
    private static final int TIMES = 3;

    public static void main(String[] args) {
        Continue con = new Continue();
        con.continueInner();
        con.continueLabel();
    }

    private void continueInner() {
        for (int i = 0; i < TIMES; i++) {
            System.out.println("i的值是" + i);
            if (i == 1) {
                //忽略本次循环剩下的语句
                continue;
            }
            System.out.println("continue之后的语句...");
        }
    }

    private void continueLabel() {
        out:
        for (int i = 0; i < TIMES; i++) {
            for (int j = 0; j < TIMES; j++) {
                System.out.println("i的值是" + i + " j的值是" + j);
                if (j == 1) {
                    //忽略本次循环剩下的语句
                    continue out;
                }
            }
        }
    }

}