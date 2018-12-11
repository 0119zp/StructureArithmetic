package com.zpan.structure_arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zpan.structure_arithmetic.arithmetic.BubbleSort;
import com.zpan.structure_arithmetic.arithmetic.SelectionSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initArithmetic();
    }

    private void initArithmetic() {

        int[] listData = {49, 38, 65, 97, 176, 213, 227, 50, 78, 34, 12, 164, 11, 18, 1};

        // 冒泡排序
        int[] listBubble = BubbleSort.getBubbleSort(listData);
        setLogList("getBubbleSort", listBubble);

        // 简单选择排序
        int[] selectionBubble = SelectionSort.getSelectionSort(listData);
        setLogList("getSelectionSort", selectionBubble);

    }

    /**
     * 排序后的数组打印日志
     * @param sortName 排序方法
     * @param list 排序后的数组
     */
    private void setLogList(String sortName, int[] list) {
        for (int i : list) {
            Log.e("Arithmetic", sortName + " =" + i);
        }
    }
}
