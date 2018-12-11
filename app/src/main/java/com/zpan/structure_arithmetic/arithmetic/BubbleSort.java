package com.zpan.structure_arithmetic.arithmetic;

/**
 * 冒泡排序
 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
 */
public class BubbleSort {

    public static int[] getBubbleSort(int[] list) {

        int tmp;
        // 外层循环控制排序趟数
        for (int i = 0; i < list.length - 1; i++) {
            // 内层循环控制每一趟排序多少次
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        return list;
    }

}
