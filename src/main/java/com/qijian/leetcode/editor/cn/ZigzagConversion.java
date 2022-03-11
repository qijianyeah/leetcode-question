package com.qijian.leetcode.editor.cn;

//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 👍 1603 👎 0


import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion{
	public static void main(String[] args) {
		Solution solution = new ZigzagConversion().new Solution();
		
	}
	
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
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
			if (curRow == 0 || curRow == numRows - 1) {
				goingDown = !goingDown;//当字符串存储在第一个或是最后一个StringBuilder对象之中时，方向改变
			}
			curRow += goingDown ? 1 : -1;//求出下一次用于存储对象的下标，当goingdown为true时+1，为false时-1；
		}
		//创建一个新的StringBuilder对象用于存储转换之后的结果。
		StringBuilder ret = new StringBuilder();
		//依次将rows集合中的对象追加到新的StringBuilder对象之中。
		for (StringBuilder row : rows) {
			ret.append(row);
		}
		return ret.toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
