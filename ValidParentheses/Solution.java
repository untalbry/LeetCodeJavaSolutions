package ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public static void main(String[] args) {
        String parentesis = "){";
        System.out.println(isValid(parentesis));
    }
    public static boolean isValid(String s){
        if(s.length()<2 || s.length()%2 != 0)return false;
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else if (c == ')' && (stack.isEmpty() || stack.poll() !='(')) return false;
            else if(c == '}' && (stack.isEmpty() || stack.poll() != '{')) return false; 
            else if (c == ']'&& (stack.isEmpty() || stack.poll() != '[')) return false; 
        }
        if(stack.isEmpty()) return true; 
        else return false; 
    }
}