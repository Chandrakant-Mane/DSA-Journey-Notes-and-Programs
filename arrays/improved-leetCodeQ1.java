package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1: Two Sum
 * https://leetcode.com/problems/two-sum/
 * 
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target. You may assume that each input would have exactly one 
 * solution, and you may not use the same element twice.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Only one valid answer exists.
 */
public class leetCodeQ1 {

    /**
     * Approach 1: Brute Force Solution
     * Time Complexity: O(n²) - nested loops through the array
     * Space Complexity: O(1) - only using constant extra space
     * 
     * Algorithm:
     * 1. For each element nums[i], check all elements after it
     * 2. If nums[i] + nums[j] == target, return [i, j]
     * 3. Continue until solution is found
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        // This should never be reached given problem constraints
        throw new IllegalArgumentException("No two sum solution exists");
    }

    /**
     * Approach 2: Hash Map Solution (Optimal)
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(n) - hash map can store up to n elements
     * 
     * Algorithm:
     * 1. Create a hash map to store value -> index mapping
     * 2. For each element, calculate complement = target - current element
     * 3. If complement exists in map, we found our answer
     * 4. Otherwise, store current element in map and continue
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in our map
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            
            // Store current number and its index
            numToIndex.put(nums[i], i);
        }
        
        // This should never be reached given problem constraints
        throw new IllegalArgumentException("No two sum solution exists");
    }

    /**
     * Approach 3: Two Pass Hash Map
     * Time Complexity: O(n) - two passes through the array
     * Space Complexity: O(n) - hash map stores all elements
     * 
     * Note: This approach first builds the entire hash map, then searches.
     * Less efficient than the single-pass approach above.
     */
    public int[] twoSumTwoPass(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // First pass: build the hash map
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }
        
        // Second pass: find the complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Make sure complement exists and is not the same element
            if (numToIndex.containsKey(complement) && numToIndex.get(complement) != i) {
                return new int[]{i, numToIndex.get(complement)};
            }
        }
        
        throw new IllegalArgumentException("No two sum solution exists");
    }

    /**
     * Helper method to print array in a formatted way
     */
    private void printResult(int[] nums, int target, int[] result, String approach) {
        System.out.println(approach + ":");
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("Explanation: nums[" + result[0] + "] + nums[" + result[1] + 
                          "] = " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        System.out.println();
    }

    /**
     * Test method with comprehensive test cases
     */
    public void runTests() {
        System.out.println("=== LeetCode #1: Two Sum - All Approaches ===\n");
        
        // Test Case 1: Standard case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        
        printResult(nums1, target1, twoSumBruteForce(nums1, target1), "Brute Force");
        printResult(nums1, target1, twoSumHashMap(nums1, target1), "Hash Map (Optimal)");
        printResult(nums1, target1, twoSumTwoPass(nums1, target1), "Two Pass Hash Map");
        
        // Test Case 2: Numbers at the end
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        
        System.out.println("Test Case 2:");
        printResult(nums2, target2, twoSumHashMap(nums2, target2), "Hash Map Solution");
        
        // Test Case 3: Same numbers (different indices)
        int[] nums3 = {3, 3};
        int target3 = 6;
        
        System.out.println("Test Case 3 (duplicate numbers):");
        printResult(nums3, target3, twoSumHashMap(nums3, target3), "Hash Map Solution");
        
        // Test Case 4: Negative numbers
        int[] nums4 = {-1, -2, -3, -4, -5};
        int target4 = -8;
        
        System.out.println("Test Case 4 (negative numbers):");
        printResult(nums4, target4, twoSumHashMap(nums4, target4), "Hash Map Solution");
        
        // Test Case 5: Mixed positive and negative
        int[] nums5 = {-3, 4, 3, 90};
        int target5 = 0;
        
        System.out.println("Test Case 5 (mixed signs):");
        printResult(nums5, target5, twoSumHashMap(nums5, target5), "Hash Map Solution");
    }

    /**
     * Performance comparison between different approaches
     */
    public void performanceTest() {
        System.out.println("=== Performance Analysis ===\n");
        
        // Create a larger test case
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i + 1;
        }
        int largeTarget = 1999; // This will match the last two elements
        
        // Measure brute force
        long startTime = System.nanoTime();
        int[] result1 = twoSumBruteForce(largeArray, largeTarget);
        long bruteForceTime = System.nanoTime() - startTime;
        
        // Measure hash map approach
        startTime = System.nanoTime();
        int[] result2 = twoSumHashMap(largeArray, largeTarget);
        long hashMapTime = System.nanoTime() - startTime;
        
        System.out.println("Array size: " + largeArray.length);
        System.out.println("Brute Force time: " + bruteForceTime + " nanoseconds");
        System.out.println("Hash Map time: " + hashMapTime + " nanoseconds");
        System.out.println("Speed improvement: " + (double)bruteForceTime / hashMapTime + "x faster");
        System.out.println("Both results match: " + Arrays.equals(result1, result2));
    }

    /**
     * Main method demonstrating all approaches with multiple test cases
     */
    public static void main(String[] args) {
        leetCodeQ1 solution = new leetCodeQ1();
        
        // Run comprehensive tests
        solution.runTests();
        
        // Run performance comparison
        solution.performanceTest();
        
        System.out.println("\n=== Key Takeaways ===");
        System.out.println("1. Hash Map approach is optimal: O(n) time, O(n) space");
        System.out.println("2. Brute force is simple but inefficient: O(n²) time, O(1) space");
        System.out.println("3. Always consider space-time tradeoffs in algorithm design");
        System.out.println("4. Hash maps are excellent for lookup-based problems");
    }
}