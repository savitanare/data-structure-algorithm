package main.java.leetCodeSolutionsSelf.StackEx.LeetCodeQuestionStackEasy.SelfSolved;

import java.util.Stack;

public class ValidParanthesis {


    public static boolean isValid(String s) {


        if(s == "") return false;

        if(s.length() % 2 != 0) return false;

        if(s.charAt(0) == '}' || s.charAt(0 ) == ']' || s.charAt(0) == ')') return false;


        Stack<Character> stack = new Stack<>();

        int i = 0;

        for(i = 0 ; i < s.length(); i ++){

            char c = s.charAt(i);

            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
                continue;
            }


            char check;

            switch (c) {

                case ')':
                check = stack.peek();
                if(check == '{' || check == '[')
                return false;
                stack.pop();
                break;

                case '}':
                check = stack.peek();
                if(check =='(' || check == '[')
                return false;
                stack.pop();
                break;

                case ']':
                check = stack.peek();
                if(check == '{' || check == '(')
                return false;
                stack.pop();
                break;
            
            }

        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {
        

        System.out.println(isValid("{}"));
    }
    
}
