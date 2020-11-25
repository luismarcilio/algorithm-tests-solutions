# Arrays

## MergeSortedArrays

It's still ugly... Hopefully I have time to improve.

I started doing it with generics but then I realized that java doesn't like generics array, then I used ArrayLists in some point.
The Array idea is the same, nevertheless.

## Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

### This should use a SET data structure. With Arrays it will be O(n²). With a Set it will be O(n). We will include it in the Set group

## Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [0]
Output: 0
Example 4:

Input: nums = [-1]
Output: -1
Example 5:

Input: nums = [-2147483647]
Output: -2147483647

Constraints:

1 <= nums.length <= 2 \* 104
-231 <= nums[i] <= 231 - 1

### Here I was tricked by the requirement... And I had to check the solution... The solution doesn't work when all numbers are negative. If input = { -1,-2,-3,-4 } the correct answer should be -1 but the solution returns 0;
