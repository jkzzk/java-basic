package com.jkzzk.basic;

/**
 * 1.一个Java文件只能有一公共主类且该主类的名称必须和该Java文件的名称相同
 * 2.javac在编译时并不区分大小写
 * 3.一个Java文件中有多个类，那么java会这多个类分别编译成多个clss文件
 * 4.全部要用英文符号
 * 5.入口方法严格定义为 public static void main(String[] args)
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
    }
}

class Helloworld {
    public static void main(String[] args) {
        System.out.println("Helloworld!");
    }
}

class HelloSchool {
    public static void main(String[] args) {
        System.out.println("HelloSchool!");
    }
}