package com.glut.xupk.basis;

/**
 * return关键字用法
 *
 * @author xupk
 * @create 2018-12-02 11:11
 **/
public class Return {

    public static void main(String[] args) {
        Return ret = new Return();
        ret.returnInner();
        int result = ret.return4Tryfinally();
        System.out.println("try...finally...块返回的值是："+result);
    }

    private void returnInner(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("k的值是" + k);
                    if (k == 1) {
                        return;
                    }
                }
            }
        }
    }

    private int return4Tryfinally(){
        int i = 1;
        try{
            i++;
            return i+1;
        }finally{
            i++;
            return -1;
        }
    }

}
