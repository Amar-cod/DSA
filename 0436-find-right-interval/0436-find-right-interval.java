import java.util.Arrays;

class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int[] ans = new int[intervals.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            int mn = 10000001;

            for (int j = 0; j < intervals.length; j++) {

                int start1 = intervals[j][0];

                if (end <= start1) {
                    if (start1 < mn) {
                        mn = start1;
                        ans[i] = j;
                    }
                }
            }
        }

        return ans;
    }
}