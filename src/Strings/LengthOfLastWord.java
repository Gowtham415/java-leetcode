package Strings;
/*
 * Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 */
public class LengthOfLastWord {
	public static void main(String[] args) {
		Solution5 sol5 = new Solution5();
		System.out.println(sol5.lengthOfLastWord("Hello world"));
	}

}

class Solution5 {
    public int lengthOfLastWord(String s) {
    	 int count=0;
         for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)!=' '){
                 count++;
             }
             if(count!=0 && s.charAt(i)==' '){
                 return count;
             }
         }
         return count;
    }
}
