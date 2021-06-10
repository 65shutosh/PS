package stringarray;

import java.util.HashMap;
//4
//Find Equal Weight largest Binary Sub Array - Problem 4
public class LargestBinarySubArray {

    public static void main(String[] args) {
        //  solution(new int[]{1, 1, 1, 1, 1, 1, 1, 0});
        //   solution(new int[]{1, 0, 1, 0, 0, 0, 0, 0});
        solution(new int[]{1, 0, 1, 0, 0, 0, 0, 0, 1});
    }


    private static void solution(int[] binaryArray) {
        // difference of number of 0's to number of 1's
        int difference_0minus1 = 0;
        //key - difference
        //value - index
        HashMap<Integer, Integer> differenceRecord = new HashMap<>();
        int longestSubstring = 0;
        int longestSubstringBeginsAt = 0;
        int countOf1 = 0;
        int countOf0 = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                countOf0++;
            } else {
                countOf1++;
            }
            difference_0minus1 = countOf0 - countOf1;
            // if difference is zero substring must start from index 0
            if (difference_0minus1 == 0) {
                longestSubstring = Math.max((i + 1), longestSubstring);
                longestSubstringBeginsAt = 0;
            } else {
                Integer previousRecord = differenceRecord.putIfAbsent(difference_0minus1, i);
                if (previousRecord != null) {
                    if ((i - previousRecord + 1) > longestSubstring) {
                        longestSubstringBeginsAt = previousRecord + 1;
                        longestSubstring = i - longestSubstringBeginsAt + 1;
                    }
                }
            }
        }

        if (longestSubstring != 0) {
            for (int i = longestSubstringBeginsAt; i < longestSubstringBeginsAt + longestSubstring; i++) {
                System.out.print(" " + binaryArray[i]);
            }
        } else {
            System.out.println("sorry! no solution found");
        }
    }
}
