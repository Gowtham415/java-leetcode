package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
You are given an array words of strings.

A move onto s consists of swapping any two even indexed characters of s, or any two odd indexed characters of s.

Two strings s and t are special-equivalent if after any number of moves onto s, s == t.

For example, s = "zzxy" and t = "xyzz" are special-equivalent because we may make the moves "zzxy" -> "xzzy" -> "xyzz" that swap s[0] and s[2], then s[1] and s[3].

Now, a group of special-equivalent strings from words is a non-empty subset of words such that:

Every pair of strings in the group are special equivalent, and;
The group is the largest size possible (ie., there isn't a string s not in the group such that s is special equivalent to every string in the group)
Return the number of groups of special-equivalent strings from words.


Example 1:

Input: words = ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
Output: 3
Explanation:
One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings are all pairwise special equivalent to these.

The other two groups are ["xyzz", "zzxy"] and ["zzyx"].  Note that in particular, "zzxy" is not special equivalent to "zzyx".
Example 2:

Input: words = ["abc","acb","bac","bca","cab","cba"]
Output: 3
 */
public class SpecialEquivalentStrings {
    public static void main(String[] args) {
        String str[] ={"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        SolutionSpecialEquivalentStrings sol = new SolutionSpecialEquivalentStrings();
        System.out.println(sol.numSpecialEquivGroups(str));
    }
}
class SolutionSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        int result = 0;
        for(String str: A){
            if(set.add(getHashBySwap(str.toCharArray()))) {
                result++;
            }
        }
        return result;
    }

    private String getHashBySwap(char[] chars){
        for(int i=0; i<chars.length;i++){
            for(int j=i+2;j<chars.length;){
                if(chars[i] > chars[j]) {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                }
                j+=2;
            }
        }

        return String.valueOf(chars);
    }
}