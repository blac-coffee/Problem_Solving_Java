/*
Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */

import java.util.ArrayList;
import java.util.List;
public class findDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<n)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=j+1)
                list.add(nums[j]);
        }
        return list;
    }
    public void swap(int[] nums,int first,int second)
    {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
