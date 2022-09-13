## Permutation

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

1. What's the range of the nums length?(at least one?)
2. Dose nums contain negative integers?(or it just contains positive integers?)
3. Are all the integers of nums unique?(or it contains duplicate integers)

Constraints:

1. 1 <= nums.length <= 6
2. -10 <= nums[i] <= 10
3. All the integers of nums are unique.

Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]