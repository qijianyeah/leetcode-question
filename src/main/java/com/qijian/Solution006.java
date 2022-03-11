package com.qijian;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qijian
 * @version 1.0
 * @description 算法Z字型变换
 * @updateRemark
 * @updateUser
 * @createDate 2021/12/9 9:24
 * @updateDate 2021/12/9 9:24
 **/

public class Solution006 {

    /*
    假设numRos = 3 ；s = "leetcod";
    res[0] = l   c
    res[1] = e t o
    res[2] = e   d
    返回res = "lc" + "eto" + "ed";
     */
    public String convert(String s, int numRows) {

        //如果行数为1时不用进行变换，直接返回该字符串就可以了
        if (numRows == 1) {
            return s;
        }

        //创建一个ArrayList集合用于存储没一行的字符。
        List<StringBuilder> rows = new ArrayList<>();
        //创建StringBuilder对象并放入rows集合之中，用于存储每一行的字符串
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }


        int curRow = 0;//用于存储下一次需要用来存储的StringBuilder对象的下标，最初下标为0对应rows集合中下标为0的对象
        boolean goingDown = false;//标志，当值为true向下。默认为false。

        //遍历数组用于将字符串s中的字符Z字型变换规则放入对应的StringBuilder对象之中。
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);//将当前拿到的字符串放入对应的StringBuilder对象之中
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;//当字符串存储在第一个或是最后一个StringBuilder对象之中时，方向改变
            curRow += goingDown ? 1 : -1;//求出下一次用于存储对象的下标，当goingdown为true时+1，为false时-1；
        }
        //创建一个新的StringBuilder对象用于存储转换之后的结果。
        StringBuilder ret = new StringBuilder();
        //依次将rows集合中的对象追加到新的StringBuilder对象之中。
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(19/5);
    }
}
