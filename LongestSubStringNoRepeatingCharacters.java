package Leetcode.Medium;

public class LongestSubStringNoRepeatingCharacters {

    public static void main(String[] args) {

        String test ="abcabcbb";

        int maxLength = 0;
        String str = "";

        for(char currentChar : test.toCharArray()){
            if(str.contains(String.valueOf(currentChar))){
                str = str.substring(1+str.indexOf(currentChar));
            }
            str = str + currentChar;
            if(str.length() > maxLength){
                System.out.println(str);
                maxLength = str.length();
            }
        }

        System.out.println(maxLength);

    }

}
