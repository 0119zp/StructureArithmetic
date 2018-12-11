package com.zpan.structure_arithmetic.arithmetic;

/**
 * 顺序查找
 * 按顺序从头到尾依次往下查找，找到数据，则提前结束查找，找不到便一直查找下去，直到数据最后一位。
 */
public class SequentialSearch {

    public static int getSequentialSearch(int[] list, int searchNum) {

        int index = -1;

        for (int i = 0; i < list.length; i++) {
            // 如果数据存在
            if (list[i] == searchNum) {
                index = i;
                break;
            }
        }

        return index;
    }

}
