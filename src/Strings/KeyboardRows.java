package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 */
public class KeyboardRows {
    public static void main(String[] args) {
        String str[] = {"Hello","Alaska","Dad","Peace"};
        SolutionKeyboardRows sol = new SolutionKeyboardRows();
        String strRes[] = sol.findWords(str);
        Arrays.asList(strRes).forEach(System.out::println);
    }
}

class SolutionKeyboardRows {
    private static final Set<Character> row1 = Set.of('q','w','e','r','t','y','u','i','o','p');
    private static final Set<Character> row2 = Set.of('a','s','d','f','g','h','j','k','l');
    private static final Set<Character> row3 = Set.of('z','x','c','v','b','n','m');

    public String[] findWords(String[] words) {

        var result = new ArrayList<String>();

        for (var word: words) {
            int row = getRow(word.charAt(0));
            boolean goodWord = true;
            for (int i = 1; i < word.length(); i++) {
                if (getRow(word.charAt(i)) != row) {
                    goodWord = false;
                    break;
                }
            }
            if (goodWord) result.add(word);
        }
        return result.toArray(new String[] {});
    }

    private int getRow(Character c) {
        c = Character.toLowerCase(c);
        return row1.contains(c) ? 1 : (row2.contains(c) ? 2 : 3);
    }
}


