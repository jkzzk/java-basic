package com.jkzzk.basic;

/**
 * 变量：在程序运行期间可以发生改变的量
 * 定义：数据类型 变量名称;
 * 赋值：借助 = 赋值运算符，将右面的字面值填到左侧的变量中
 * @author jkzzk
 * @description 变量
 * @data 2020/8/30
 */
public class Variable {

    public static void main(String[] args) {
        int a; a=1;
        int b = 2;
        int c = 3;

        int x = 7;
        int y = a*x + b*x*x + c*x*x*x;

        System.out.println(y);  // 726
    }

}
