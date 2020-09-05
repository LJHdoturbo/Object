package com.turbo.object;

import java.util.Scanner;

/**
 * @auther LJH turbo
 * @date 2020-09-04 21:06
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        int max =util.getMax(arr);
        System.out.println("最大值为："+max);
        int min =util.getMin(arr);
        System.out.println("最小值为："+min);
        util.reArr(arr);
        util.sortArr(arr);
        System.out.print("请输入想要查找的元素：");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        util.getIndex(arr , x);
        System.out.println("数组的总和为："+ util.getSum(arr));
    }
}
