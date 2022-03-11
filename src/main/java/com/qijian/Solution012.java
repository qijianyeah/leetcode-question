package com.qijian;

/**
 * @author qijian
 * @version 1.0
 * @description 整数转罗马数字
 * @updateRemark
 * @updateUser
 * @createDate 2021/12/16 9:32
 * @updateDate 2021/12/16 9:32
 **/

public class Solution012 {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //用于存储罗马数字 字符
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        //创建一个StringBuilder对象用来存储罗马数字
        StringBuffer roman = new StringBuffer();
        //遍历十进制数字
        for (int i = 0; i < values.length; ++i) {
            //分别取出values和symbol中
            int value = values[i];
            String symbol = symbols[i];
            //当num大于当前的value值时，说明需要使用此时的符号表示十进制数，那么就将此时的字符添加到roman对象之中
            //当num小于当前value值时，那么就直接选用下一个字符
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        int num = 986;
        Solution012 solution012 = new Solution012();
        String s = solution012.intToRoman(num);
        System.out.println(s);
    }
}
