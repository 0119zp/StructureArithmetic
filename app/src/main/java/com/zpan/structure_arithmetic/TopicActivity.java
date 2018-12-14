package com.zpan.structure_arithmetic;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zpan.structure_arithmetic.topic.TopicUtil_1;

import java.util.Arrays;

public class TopicActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        initTopic();
    }

    private void initTopic() {
        // 1.输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果
        String str1 = TopicUtil_1.stringParseAscii("abx");
        setLogStr("stringParseAscii", str1);

        // 2.回文数字判断
        boolean isPalindrome = TopicUtil_1.isPalindrome("345543");
        setLogStr("isPalindrome", isPalindrome + "");

        // 3.手动输入一个字符串，仅限小写字母，统计并输出每个字符在字符串中出现的次数,并输出。
        TopicUtil_1.getCharCount("abcdasdxsbsssbbaa");

        // 4.比较二维数组列最小值，组成一个新数组返回。
        int[] minArr = TopicUtil_1.getColMin();
        setLogStr("getColMin", Arrays.toString(minArr));

        // 5.奇数偶数位置分别排序
        TopicUtil_1.numSort("8 12 3 7 6 5 9");

        // 6.删除字符串中字符个数最少的字符，最少字符串有多个，最少的要全部删除;然后返回该子字符串
        String deleteLittle = TopicUtil_1.deleteLittle("aaaabbbbsssscccxxxx");
        setLogStr("deleteLittle", deleteLittle);
    }

    /**
     * 日志信息
     */
    private void setLogStr(String key, String string) {
        Log.e("topic", key + " =" + string);
    }

}
