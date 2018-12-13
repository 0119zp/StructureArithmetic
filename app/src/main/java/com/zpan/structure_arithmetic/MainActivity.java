package com.zpan.structure_arithmetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zpan.structure_arithmetic.arithmetic.BinarySearch;
import com.zpan.structure_arithmetic.arithmetic.BubbleSort;
import com.zpan.structure_arithmetic.arithmetic.InsertionSort;
import com.zpan.structure_arithmetic.arithmetic.SelectionSort;
import com.zpan.structure_arithmetic.arithmetic.SequentialSearch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initArithmetic();
    }

    /**
     * 题目测试
     */
    public void startTopic(View view) {
        startActivity(new Intent(MainActivity.this, TopicActivity.class));
    }

    private void initArithmetic() {

        int[] listData = {49, 38, 65, 97, 176, 213, 227, 50, 78, 34, 12, 164, 11, 18, 1};

        // 冒泡排序
        int[] bubbleStor = BubbleSort.getBubbleSort(listData);
        setLogList("getBubbleSort", bubbleStor);

        // 简单选择排序
        int[] selectionSort = SelectionSort.getSelectionSort(listData);
        setLogList("getSelectionSort", selectionSort);

        // 插入排序
        int[] insertionSort = InsertionSort.getInsertionSort(listData);
        setLogList("getInsertionSort", insertionSort);

        // 顺序查找
        int searchResult = SequentialSearch.getSequentialSearch(listData, 176);
        setLogListIndex(176, searchResult);

        // 二分查找
        int binarySearch = BinarySearch.getBinarySearch(listData, 97);
        setLogListIndex(97, binarySearch);

    }

    /**
     * 排序后的数组打印日志
     *
     * @param sortName 排序方法
     * @param list     排序后的数组
     */
    private void setLogList(String sortName, int[] list) {
        for (int i : list) {
            Log.e("Arithmetic", sortName + " =" + i);
        }
    }

    /**
     * 查找结果
     *
     * @param num    要查找的数字
     * @param result 查找的结果
     */
    private void setLogListIndex(int num, int result) {
        if (result == -1) {
            Log.e("Arithmetic", "没有找到");
        } else {
            Log.e("Arithmetic", num + "所在的下标 =" + result);
        }
    }
}
