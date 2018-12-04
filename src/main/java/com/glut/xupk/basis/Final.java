package com.glut.xupk.basis;

/**
 * final关键字实例
 *
 * @author xupk
 * @create 2018-12-04 22:42
 **/
public class Final {

    public static void main(String[] args){
        Final f = new Final();
        f.finalData();
        f.finalRef();
        f.finalMethod();
        f.finalMethod(null);
    }

    public void finalData(){
        final int a = 10;
        //会报错：无法为最终变量a分配值
//        a = 20;
        System.out.println("a="+a);
    }

    public void finalRef(){
        final Student s = new Student("张三","男");
        // 会报错，无法为最终变量s分配值
//        s = new Student("李四","女");
        System.out.println(s.toString());
    }

    public final void finalMethod(){
        System.out.println("这是一个final方法，不可被覆盖");
    }

    public final void finalMethod(String s){
        System.out.println("重载了final方法");
    }

    class Student{
        String name;
        String sex;

        public Student(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }
}
