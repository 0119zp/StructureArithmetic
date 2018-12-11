package com.zpan.structure_arithmetic.arithmetic;

/**
 * 简单选择排序
 * 原理：每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕。
 * 也就是：每一趟在n-i+1(i=1，2，…n-1)个记录中选取关键字最小的记录作为有序序列中第i个记录。
 *
 * 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，
 * 将它与arrr[1]交换；第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 */
public class SelectionSort {

    public static int[] getSelectionSort(int[] list) {
        // 做第i趟排序
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            // 选最小的记录
            for (int j = minIndex + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    // 记下目前找到的最小值所在的位置
                    minIndex = j;
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != minIndex) {
                // 交换list[i]和list[currentIndex]
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }

        return list;
    }

}
