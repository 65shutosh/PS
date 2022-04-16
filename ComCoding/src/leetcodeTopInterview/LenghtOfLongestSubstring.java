package leetcodeTopInterview;

import java.util.HashSet;

public class LenghtOfLongestSubstring {

    public int solution(String str) {
        int len = str.length();
        if (len == 1 || len == 0)
            return len;
        int longstSbStr = 1;
        boolean duplicate = false;
        int i = 0, j = 1;
        //LinkedHashSet<Character> list = new LinkedHashSet<>();
       // HashMap<Character,Boolean> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
       // list.add(str.charAt(i));
       // map.put(str.charAt(i),true);
        set.add(str.charAt(i));
        while (j < len) {
            if (duplicate) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = false;
                    j++;
                } else {
               //     list.remove(str.charAt(i));
                   // map.remove(str.charAt(i));
                    set.remove(str.charAt(i));
                }
                i++;
            } else {
             //   if (!list.add(str.charAt(j)))
             //   if(Boolean.TRUE.equals(map.put(str.charAt(j), true)))
                if(!set.add(str.charAt(j)))
                    duplicate = true;
                else {
                    int currentLen = j - i + 1;
                    longstSbStr = Math.max(longstSbStr, currentLen);
                    j = j < len - 1 ? j + 1 : j;
                }

            }
        }

        return longstSbStr;
    }
    }
