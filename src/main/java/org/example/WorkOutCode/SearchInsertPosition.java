package org.example.WorkOutCode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target)
                return i;
            else if (nums[i]>target){

            }
        }
        return 0;
    }
    public static void main(String[] args) {
       int[] nums = {1,3,5,6};
       int target = 5;
       SearchInsertPosition s=new SearchInsertPosition();
       int result=s.searchInsert(nums,target);
        System.out.println(result);
    }
}
