/*
Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
import java.util.ArrayList;
import java.util.List;
public class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=j+1)
                list.add(j+1);
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
