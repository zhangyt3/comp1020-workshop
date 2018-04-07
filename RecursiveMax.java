public class RecursiveMax {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{4,6,2,7,8,9}));
    }

    public static int maxValue(int[] nums) {
        return maxValueHelper(nums, 0, 0);
    }

    private static int maxValueHelper(int[] nums, int curIndex, int curMax) {
        if (curIndex == nums.length) {
            return curMax;
        }

        if (nums[curIndex] > curMax) {
            curMax = nums[curIndex];
        }

        return maxValueHelper(nums, ++curIndex, curMax);
    }

}
