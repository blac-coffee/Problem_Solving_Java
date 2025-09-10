import java.util.Arrays;

public class Cyclic_Sort {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.print(Arrays.toString(nums));

    }
    static void sort(int[] nums)
    {
        int n= nums.length;
        int i=0;

        while(i<n)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}