package Strings;

import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 
 */
public class validParenthesis {
	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		System.out.println(sol2.isValid("{]}"));
		
	}

}
class Solution2 {
    public boolean isValid(String s) {
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
    			stack.push(s.charAt(i));
    		}
    		
    		if(s.charAt(i)=='}'){
                if(!stack.empty() && stack.peek()=='{') stack.pop();
                else
                    return false;
            }
           if(s.charAt(i)==']'){
                if(!stack.empty() && stack.peek()=='[') stack.pop();
                else
                    return false;
            }
            if(s.charAt(i)==')'){
                if(!stack.empty() && stack.peek()=='(') stack.pop();
                else
                    return false;
            }
    	}
    	
    	if(stack.empty()){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}