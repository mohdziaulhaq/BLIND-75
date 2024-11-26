import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        // String text = "abcdefghijklmnopqrstuvwxyz";
        // for(char c : text.toCharArray())
        // System.out.print(c+"-"+(int)c+"   ");
        

        // System.out.println(isAnagram_BruteForce(s,t));
        // System.out.println(isAnagram(s,t));
        System.out.println(isAnagram_Optimal(s,t));
    }

    //Brute Force
    public static boolean isAnagram_BruteForce(String s, String t) {
        if(s.length() != t.length())
        return false;

        char[] sSorted = s.toCharArray();
        char[] tSorted = t.toCharArray();
        Arrays.sort(sSorted);
        Arrays.sort(tSorted);

        return Arrays.equals(sSorted, tSorted);
    }

    //Using HashMap
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i),0)+1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i),0)+1);
        }
        return countS.equals(countT);
    }

    // Most Optimal Approach without using HashMap
    public static boolean isAnagram_Optimal(String s, String t){
        if(s.length() != t.length())
        return false;

        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int val : count){
            if(val != 0)
            return false;
        }
        // remove it
        return true;
    }
}
