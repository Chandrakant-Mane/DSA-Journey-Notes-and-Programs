package DynamicProgramming ;

public class leetCodeQ2786 {
    public static long helper(int[] nums, int x, int score, int i, int previdx) {
        if (i == nums.length) {
            return score;
        }
        long skip = helper(nums, x, score, i + 1, previdx);
        long take;
        score += nums[i];
        if (nums[previdx] % 2 == nums[i] % 2) {
            take = helper(nums, x, score, i + 1, i);
        } else
            take = helper(nums, x, score - x, i + 1, i);

        return Math.max(skip, take);

    }
    public static void main(String[] args) {
        int[] nums = { 38,92,23,30,25,96,6,71,78,77,33,23,71,48,87,77,53,28,6,20,90,83,42,21,64,95,84,29,22,21,33,36,53,51,85,25,80,56,71,69,5,21,4,84,28,16,65,7} ;
        int x = 52 ;

        System.out.println(helper(nums, x, nums[0], 1, 0));
    }
}
