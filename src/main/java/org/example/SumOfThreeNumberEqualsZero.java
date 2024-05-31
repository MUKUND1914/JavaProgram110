package org.example;

import java.util.ArrayList;
import java.util.List;

public class SumOfThreeNumberEqualsZero {
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
        int start=nums[0];
        int sum=0;
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>outerList=new ArrayList<>();

        for(int i=1;i<nums.length;i++){
            for(int j=i;j<=i;j++){
                sum=start+j;
                if (sum==0)
                    list.add(j);
            }
            if(sum==0){
                list.add(sum);
                outerList.add(list);
            }


        }
        System.out.println(outerList);
    }
}
