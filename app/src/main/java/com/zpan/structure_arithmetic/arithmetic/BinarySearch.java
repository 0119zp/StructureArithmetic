package com.zpan.structure_arithmetic.arithmetic;

/**
 * 二分查找
 * 前提：已排序的数组中查找
 * <p>
 * 二分查找的基本思想是：首先确定该查找区间的中间点位置： int mid = (low+upper) / 2；
 * 然后将待查找的值与中间点位置的值比较：若相等，则查找成功并返回此位置。
 * 若中间点位置值大于待查值，则新的查找区间是中间点位置的左边区域。
 * 若中间点位置值小于待查值，则新的查找区间是中间点位置的右边区域。
 * 下一次查找是针对新的查找区间进行的。
 */
public class BinarySearch {

    public static int getBinarySearch(int[] list, int searchNum) {

        int low = 0;
        int up = list.length - 1;

        while (low <= up) {
            int middle = (up + low) / 2;

            if (list[middle] < searchNum) {
                low = middle + 1;
            } else if (list[middle] > searchNum) {
                up = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
