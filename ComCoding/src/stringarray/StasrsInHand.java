package stringarray;

import java.util.HashMap;
//5
//If given an array with two characters
//|***|||***|**|*|
//Find the number of '*' enclosed between | for given start and end point
//For example
//1,5 => 3
//2,5 => 0
//1,16 => 9
//Input for method - character array, array of start points, array of end points
//Return from method - array of number of '*' for that start and end point
//Character array can have upto million size
//Number of pairs in start and end array can be upto 10k
public class StasrsInHand {
    public static void main(String[] args) {
        char[] data = new char[]{'|', '*', '*', '*', '|', '|', '|', '*', '*', '*', '|', '*', '*', '|', '*', '|'};
        int[] startPoints = new int[]{1, 2, 1};
        int[] endPoints = new int[]{5, 5, 16};
        int[] sol = solution(data, startPoints, endPoints);
        for (int d : sol
        ) {
            System.out.println(d);
        }
    }

    private static int[] solution(char[] data, int[] startPoints, int[] endPoints) {
        int queriesCount = startPoints.length;
        if (queriesCount != endPoints.length)
            return null;

        HashMap<Integer, Integer> pipesRecord = new HashMap<>();
        int dataLength = data.length;
        getPipesRecord(data, dataLength, pipesRecord);

        int[] solution_starCounts = new int[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            int start = startPoints[i];
            int end = endPoints[i];
            // hoping points are valid end > start
            // and they are not out of bound
            int[] validPoints = getValidPoints(data, start - 1, end - 1);
            if (validPoints[0] == validPoints[1]) {
                solution_starCounts[i] = 0;
                continue;
            }
            int pipesInBetween = pipesRecord.get(validPoints[1]) - pipesRecord.get(validPoints[0]) - 1;

            solution_starCounts[i] = (validPoints[1] - validPoints[0] - 1 - pipesInBetween);
        }
        return solution_starCounts;
    }

    private static void getPipesRecord(char[] data, int dataLength, HashMap<Integer, Integer> pipesRecord) {
        int pipesCount = 0;
        for (int i = 0; i < dataLength; i++) {
            if (data[i] == '|')
                pipesRecord.put(i, ++pipesCount);
        }

    }

    private static int[] getValidPoints(char[] data, int start, int end) {
        while (end > start) {
            if (data[start] != '|')
                start++;
            if (data[end] != '|')
                end--;
            if (data[end] == '|' && data[start] == '|')
                return new int[]{start, end};
        }
        return new int[]{0, 0};
    }

}
