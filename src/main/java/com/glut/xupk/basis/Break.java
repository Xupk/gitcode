package com.glut.xupk.basis;

/***
 *
 */
public class Break {
    private static final int TIMES = 10;

    public static void main(String[] args) {
        Break bre = new Break();
        bre.breakOutLabel();
        bre.breakInner();
        bre.breakSwitch("B");
    }

    private void breakOutLabel() {
        out:
        for (int i = 0; i <= TIMES; i++) {
            for (int j = 0; j <= TIMES; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (j == 4) {
                    break out;
                }
            }
        }
    }

    private void breakInner() {
        for (int i = 0; i <= TIMES; i++) {
            for (int j = 0; j <= TIMES; j++) {
                System.out.println("i=" + i + " j=" + j);
                if (j == 4) {
                    break;
                }
            }
        }
    }

    private void breakSwitch(String level) {
        switch ( level) {
            case "A":
                System.out.println("case A...");
                break;
            case "B":
                System.out.println("case B...");
            case "C":
                System.out.println("case C...");
                break;
            default:
                System.out.println("default...");
        }
    }
}
