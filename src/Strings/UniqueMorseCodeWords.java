package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.

 */

public class UniqueMorseCodeWords {
	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		SolutionUniqueMorseCodes sol = new SolutionUniqueMorseCodes();
		System.out.println(sol.uniqueMorseRepresentations(words));
	}
	
}

class SolutionUniqueMorseCodes {
    public int uniqueMorseRepresentations(String[] words) {
    	Map<Character,String> codeMap = new HashMap<Character,String>();
        String[] codesPatterns = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	int i = 65;
        for(String codePattern:codesPatterns) {
        	codeMap.put((char) i,codePattern);
        	i++;
        }
        Set<String> set = new HashSet<String>();

        for(String str : words) {
            StringBuffer sb = new StringBuffer();
        	for(int j=0;j<str.length();j++) {
        		sb.append(codeMap.get(Character.toUpperCase(str.charAt(j))));
        	}
        	set.add(sb.toString());
        }
        
        return set.size();
    }
}
