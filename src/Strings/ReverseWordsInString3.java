package Strings;
/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

 */
public class ReverseWordsInString3 {
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		Solution11 sol = new Solution11();
		System.out.println(sol.reverseWords(s));
	}

}

class Solution11 {
    public String reverseWords(String s) {
    	
    	String[] strArray = s.split("\\s");
    	
    	StringBuffer sb = new StringBuffer();
    	for(String str:strArray) {
    		for(int i=str.length()-1;i>=0;i--) {
    			sb.append(str.charAt(i));
    		}
    		sb.append(" ");
    	}
    	String res = sb.toString().trim();
    	return res;
        
    }
}
