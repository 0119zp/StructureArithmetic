package com.zpan.structure_arithmetic.arithmetic;

/**
 * 冒泡排序
 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
 *
 * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。
 * 即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，
 * 直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
 */
public class BubbleSort {

    public static int[] getBubbleSort(int[] list) {

        int temp;
        // 外层循环控制排序趟数
        for (int i = 0; i < list.length - 1; i++) {
            // 内层循环控制每一趟排序多少次
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

}
