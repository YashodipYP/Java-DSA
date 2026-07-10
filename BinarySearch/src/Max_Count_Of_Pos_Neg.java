public class Max_Count_Of_Pos_Neg {

        public int maximumCount(int[] nums) {
            int n = nums.length;

            // Find first positive (> 0)
            int firstPositive = n;
            int lo = 0, hi = n - 1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (nums[mid] > 0) {
                    firstPositive = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            int positiveCount = n - firstPositive;

            // Find first non-negative (>= 0)
            int firstNonNegative = n;
            lo = 0;
            hi = n - 1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;

                if (nums[mid] >= 0) {
                    firstNonNegative = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            int negativeCount = firstNonNegative;

            return Math.max(positiveCount, negativeCount);
        }
    }

