package com.turbo.object;

/**
 * @auther LJH turbo
 * @date 2020-09-04 20:49
 */
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > arr[0]) {
                 max = arr[i];
            }
        }
        return max;
    }
    //求数组的最小值
    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        return min;
    }
    //求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //求数组的平均值
    public double getAvg(int[] arr){
        return getSum(arr)/arr.length;
    }

    //数组的反转
    public void reArr(int[] arr){
        for (int i = 0 , j = arr.length-1; i < j; i++ , j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("反转后的数组：");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" "+arr[k]);
        }
        System.out.println();
    }
    //数组的复制
    public int[] copyArr(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //数组的排序
    public void sortArr(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("排序后的数组为：");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" "+arr[k]);
        }
        System.out.println();
    }
    //查找指定元素
    public void getIndex(int[] arr , int dest){
        boolean isFalg = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == dest){
                System.out.println("找到指定元素，位置为："+ i);
                isFalg = false;
            }
        }
        if(isFalg){
            System.out.println("没有找到指定的元素！");
        }
    }
}
