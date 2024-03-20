package EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution{
    public static void main(String [] args){
        String [] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String [] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(token.equals("-")){
                stack.push(-(stack.pop() - stack.pop()));
            }else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            }else{
                stack.push( Integer.parseInt(token));
            }
        }
        return stack.pop(); 
    }

}