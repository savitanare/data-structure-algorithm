package main.java.leetCodeSolutionsSelf.StackEx;

import java.util.Stack;

public class StackBasicEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println("---------------Data in stack ------------------------");

        System.out.println("Data available in stack :" +stack);

        System.out.println("--------------------Pop Operation on stack -------------------");
        String poppedElement = stack.pop();
        System.out.println("Data available after pop : " +stack + "\nElement which are popped : " +poppedElement);


        System.out.println("-----------------Peek Operation on stack ---------------------");
        String peekElement = stack.peek();
        System.out.println("Element which are peeked: " +peekElement +"\nAfter element peeked stack is : " +stack);

        System.out.println("-----------------Empty Operation on stack ---------------------");

        boolean isEmptyStack = stack.isEmpty();
        System.out.println("check if stack is empty or not : " +isEmptyStack);

        System.out.println("-----------------Iteration over stack ---------------------");
        for(String str : stack){
            System.out.println(str);
        }
        
    }
    
}
