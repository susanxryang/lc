import java.util.*;

public class intervalIntersection986 {
    public static void main(String[] args) {

    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0)
            return new int[][] {};
        
            List<int[]> res = new ArrayList<>();

        int i = 0;
        int j = 0;
        // check if current index is in both first and second arrat
        // if in both, add index until one array ends
        // if not in both, find next index such that in both array

        int startMax, endMin;
        while (i < firstList.length && j < secondList.length) {
            startMax = Math.max(firstList[i][0], secondList[j][0]);
            endMin = Math.min(firstList[i][1], secondList[j][1]);

            if (endMin >= startMax) { // curr is in both intervals
                res.add(new int[] { startMax, endMin });
            } // found last digit where currBack in both array, add front and back to result

            if (firstList[i][1] == endMin) { // move to the next set of
                i++;
            }
            if (secondList[j][1] == endMin) {
                j++;
            }

        }

        return res.toArray(new int[res.size()][2]);
    }
}