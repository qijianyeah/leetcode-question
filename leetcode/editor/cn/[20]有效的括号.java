//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 👍 2814 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        int n = s.length();//字符串的长度
        //知只有当字符串个数为偶数时才可能是有效字符串 ， 当长度是奇数时之间返回false
        if (n % 2 == 1) {
            return false;
        }

        //map存储匹配括号
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        //使用LinkedList作为栈使用
        Deque<Character> stack = new LinkedList<Character>();
        //for 循环用于遍历字符串的每一个字符
        for (int i = 0; i < n; i++) {
            //获取第i个字符
            char ch = s.charAt(i);
            //判断pairs Map<Character,Character>key中是否存在该字符串
            if (pairs.containsKey(ch)) {
                //如果此时栈中是空的，或 栈头部拿出的字符串在pairs中不存在，返回false
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                //存在该字符串出栈
                stack.pop();
            } else {
                //不存在该字符串，进栈
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}

//leetcode submit region end(Prohibit modification and deletion)
