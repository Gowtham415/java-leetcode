package Strings;
/*
 * Given an array words of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

 

Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
	public static void main(String[] args) {
		SolutionFindCommonChars sol = new SolutionFindCommonChars();
		String[] strs= {"bella","label","roller"};
		sol.commonChars(strs).forEach(System.out::println);
		
	}
	
}

class SolutionFindCommonChars {
    public List<String> commonChars(String[] words) {
    	Map<Character,Integer> res = new HashMap<Character, Integer>();
        for(char i : words[0].toCharArray() ){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        
        for(int i = 1;i<words.length;i++){
            char[] temp = words[i].toCharArray();
            Map<Character,Integer> map = new HashMap<Character, Integer>();
            
            for(char j : temp){
                if(res.containsKey(j)){
                    map.put(j,Math.min(map.getOrDefault(j,0)+1,res.get(j)));
                }
            }
            res = map;
        }
        
        List<String> result = new ArrayList<String>();
        for(char i : res.keySet()){
            int idx = res.get(i);
            while(idx > 0){
                result.add(""+i);
                idx--;
            }
        } 
        return result;
        
    }
}