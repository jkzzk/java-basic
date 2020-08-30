package com.jkzzk.basic;

/**
 * 标识符：由字母、数字、下划线、$符号组成，不能由数字开头，不能是JAVA中的关键字或预定义保留字
 * 字面值：写在程序中的数字、字符等一些在程序运行过程中不可变的值
 */
public class MathCalc {

    public static void main(String[] args) {
        System.out.println(5+6); // 11
        System.out.println(5-6); // -1
        System.out.println(5*6); // 30
        System.out.println(5/6.0); // 0.8333333333333334

        // 复杂的可变计算时,变得很笨重
        System.out.println(1*6 + 2*6*6 + 3*6*6*6);  // 726
    }

}
