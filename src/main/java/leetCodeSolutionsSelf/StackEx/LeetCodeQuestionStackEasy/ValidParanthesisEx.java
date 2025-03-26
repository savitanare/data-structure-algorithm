package main.java.leetCodeSolutionsSelf.StackEx.LeetCodeQuestionStackEasy;

import java.util.Stack;

public class ValidParanthesisEx {

    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                System.out.println(stack);
                stack.push(ch);  // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }
                char top = stack.pop();
                System.out.println(top);
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;  // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));          // true
        // System.out.println(isValid("()[]{}"));      // true
        // System.out.println(isValid("(]"));          // false
        // System.out.println(isValid("([)]"));        // false
        // System.out.println(isValid("{[]}"));    
       
    }
    
}
