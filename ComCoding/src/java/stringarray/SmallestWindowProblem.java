package java.stringarray;

import java.util.HashMap;
//1
//https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
// Problem -Given two strings, string1 and string2, the task is to find
// the smallest substring in string1 containing all characters of string2
// efficiently.
//
//Examples:
//    Input: java.string = “this is a test java.string”, pattern = “tist”
//    Output: Minimum window is “t stri”
//    Explanation: “t stri” contains all the characters of pattern.
//
//    Input: java.string = “geeksforgeeks”, pattern = “ork”
//    Output: Minimum window is “ksfor”
public class SmallestWindowProblem {
    // return the smallest window in S with all the characters of P
    // if no such window exists, return "-1"
    public static String smallestWindow(String s, String p) {
        if (p.length() > s.length()) return "-1";
        // Your code here
        HashMap<Character, Integer> matcher = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            matcher.computeIfPresent(p.charAt(i), (key, value) -> value + 1);
            matcher.putIfAbsent(p.charAt(i), 1);
        }
        System.out.println(matcher);
        int counter = matcher.size();
        int minSolSize = s.length() + 1;
        int minSolStartIndex = -1;
        int l = 0, r = 0;
        while (r < s.length()) {
            if (matcher.containsKey(s.charAt(r))) {
                matcher.compute(s.charAt(r), (key, value) -> value - 1);
                if (matcher.get(s.charAt(r)) == 0)
                    counter--;
            }

            while (counter == 0) {
                if (matcher.containsKey(s.charAt(l))) {
                    matcher.compute(s.charAt(l), (key, value) -> value + 1);
                    if (matcher.get(s.charAt(l)) > 0) {
                        counter++;
                        // if counter becomes one we record this value being a solution
                        if (minSolSize > (r - l + 1)) {
                            minSolSize = r - l + 1;
                            minSolStartIndex = l;
                        }
                    }
                }
                l++;
            }
            r++;
        }
        System.out.println(minSolStartIndex);
        System.out.println(minSolSize);
        if (minSolSize > s.length()) return "-1";
        return s.substring(minSolStartIndex, minSolSize + minSolStartIndex);
    }
}
