package leetcode;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid921 {

    public void MinimumAddtoMakeParenthesesValid921() {
        String S = "()))((";
        Stack<Character> sStack = new Stack();
        for (char c : S.toCharArray()) {
            if ((c == '(')) {
                sStack.push(c);
            } else {
                if (!sStack.empty() && sStack.peek() == '(') {
                    sStack.pop();
                } else {
                    sStack.push(c);
                }
            }
        }
        System.out.println(sStack.size());
    }
}
