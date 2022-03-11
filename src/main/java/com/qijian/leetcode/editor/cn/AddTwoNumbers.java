package com.qijian.leetcode.editor.cn;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 👍 7669 👎 0


public class AddTwoNumbers{
	public static void main(String[] args) {
		Solution solution = new AddTwoNumbers().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	//		ListNode pre = new ListNode(0);//设置预先指针
	//		ListNode cur = pre;//cur 也指向pre
	//		int carry = 0;//用于记录进位值
	//		while (l1 != null || l2 != null) {
	//			int x = l1 == null ? 0 : l1.val;
	//			int y = l2 == null ? 0 : l2.val;
	//			int sum = x + y + carry;//相同位数相加的和
	//
	//			carry = sum / 10;//进位值
	//			sum = sum % 10;//当前位的实际值
	//			cur.next = new ListNode(sum);//将当前位追加到结果队列
	//			cur = cur.next;//cur指向下一个节点，此时pre还指向源节点
	//			if (l1 != null)//如果当前节点不为空 指向下一节点
	//				l1 = l1.next;
	//			if (l2 != null)//如果当前节点不为空 指向下一节点
	//				l2 = l2.next;
	//		}
	//		if (carry == 1) {//因为数据是位于位之间的相加所以最大不超过19,也就是carry要么是0要么是1
	//			cur.next = new ListNode(carry);//将新节点追加到cur。
	//		}
	//		return pre.next;//数据保证列表表示的数字不含前导零
	//	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
