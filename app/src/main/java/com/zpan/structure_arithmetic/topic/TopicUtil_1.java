package com.zpan.structure_arithmetic.topic;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 各种题目测试工具类
 */
public class TopicUtil_1 {


    /**
     * 1.程序实现目标： 输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。
     * 程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符。
     */
    public static String stringParseAscii(String str) {

        StringBuffer result = new StringBuffer();
        char tmp;
        for (int i = 0; i < str.length(); i++) {
            tmp = (char) (str.charAt(i) + 5);
            if (tmp > 'z') {
                result.append('a');
            } else {
                result.append(tmp);
            }
        }

        return result.toString();
    }

    /**
     * 2.回文数字判断
     * 有这样一类数字，他们顺着看和倒着看是相同的数，例如：121,656,2332等，这样的数字就称为：
     * 回文数字。编写一个函数，判断某数字是否是回文数字。
     *
     * @param str 整数，以字符串表示
     * @return 回文数字判断
     */
    public static boolean isPalindrome(String str) {

        boolean result = false;
        for (int i = 0; i <= str.length() / 2 - 1; i++) {
            int last = str.length() - 1 - i;
            if (str.charAt(i) == str.charAt(last)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * 3.手动输入一个字符串，仅限小写字母，统计并输出每个字符在字符串中出现的次数,并输出。提示(可以用Map)
     * <p>
     * 实例：
     * 输入：aaabbbccc
     * 输出： a 3 b 3 c 3
     */
    public static void getCharCount(String str) {

        String regularLower = "^[a-z]*$";

        if (str.matches(regularLower)) {
            Map<Character, Integer> map = getCharMap(str);
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        } else {
            System.out.println("输入的字符不合法，包含有小写字母");
        }

    }

    private static Map<Character, Integer> getCharMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }

    /**
     * 4.比较二维数组列最小值，组成一个新数组返回。(实现核心算法，不需要使用IO)
     * 输入：intArr = {{5,6,1,16},{7,3,9}}
     * 输出：intArrs ={1,3}
     */
    public static int[] getColMin() {

        int[][] arr = {{5, 6, 1, 16}, {7, 3, 9}};

        int[] minArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = arr[i];
            Arrays.sort(tmp);
            minArr[i] = tmp[0];
        }
        return minArr;
    }

    /**
     * 5.奇数偶数位置分别排序
     * 输入若干（不超过1000个）非负整数数字，请先取出为奇数的数字按从大到小排序，
     * 再取出偶数从小到大排序
     * 输入8 12 3 7 6 5 9
     * 9 8 6 3
     * 5 7 12
     * 输出9 5 8 7 6 12 3
     */
    public static void numSort(String str) {

        // 转为相应数组
        String[] numArr = str.split(" ");
        int numLength = numArr.length;

        // 奇数数组
        String[] oddArr;
        // 偶数数组
        String[] evenArr;
        if (numLength % 2 == 0) {
            oddArr = new String[numLength / 2];
            evenArr = new String[numLength / 2];
        } else {
            oddArr = new String[numLength / 2 + 1];
            evenArr = new String[numLength / 2];
        }

        int indexOdd = 0;
        int indexEven = 0;
        for (int i = 0; i < numLength; i++) {
            if (i % 2 == 0) {
                oddArr[indexOdd++] = numArr[i];
            } else {
                evenArr[indexEven++] = numArr[i];
            }
        }

        ascendingSort(oddArr);//奇数位升序
        descendingSort(evenArr);//偶数位降序

        for (int i = 0; i < indexEven; i++) {
            if (i == 0) {
                System.out.print(oddArr[i] + " " + evenArr[i]);
            } else {
                System.out.print(" " + oddArr[i] + " " + evenArr[i]);
            }
        }
        if (indexOdd != indexEven) {
            System.out.println(" " + oddArr[indexOdd - 1]);
        }
    }

    private static void ascendingSort(String[] data) {
        int length = data.length;
        String temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Integer.valueOf(data[i]) > Integer.valueOf(data[j])) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    private static void descendingSort(String[] data) {
        int length = data.length;
        String temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Integer.valueOf(data[i]) < Integer.valueOf(data[j])) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * 6.删除字符串中字符个数最少的字符，最少字符串有多个，最少的要全部删除;然后返回该子字符串
     */
    public static String deleteLittle(String str) {

        Map<Character,Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for(int i = 0;i<ch.length;i++) {
            if(!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }


        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){

            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {

                return o1.getValue().compareTo(o2.getValue());
            }
        });

        String[] s = str.split(list.get(0).getKey().toString());
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<s.length;i++) {
            sb.append(s[i]);
        }

        return sb.toString();
    }


}
