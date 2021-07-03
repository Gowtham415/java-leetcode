package Strings;

/*
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

public class ValidPalindrome {
	public static void main(String[] args) {
		ValidPalindromeSolution sol = new ValidPalindromeSolution();
		System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
	}
}

class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
    	
    	StringBuilder sb = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0 ; i<sb.length() ; i++) {		
			char c = sb.charAt(i);
			if(Character.isDigit(c) || ( (int)c>=(int)'a' &&  (int)c<=(int)'z' ) || (  (int)c>=(int)'A' &&                       (int)c<=(int)'Z'  )  )
				sb2.append(c);
		
		}
        
        // System.out.println(sb2);
	
        int l=0;
        int r= sb2.length()-1;
        
        while(l<=r){
            
            char c1=Character.toUpperCase(sb2.charAt(l));
            char c2=Character.toUpperCase(sb2.charAt(r));
            if(c1!=c2)
               return false;
            
            l++;
            r--;      
            
        }
		return true;
    }
}
