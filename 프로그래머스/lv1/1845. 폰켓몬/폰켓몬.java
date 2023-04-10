import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int choice=nums.length/2;
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsValue(nums[i]))
                map.put(i,nums[i]);
        }

        int size=map.size();
        System.out.println(map);
        if(size>choice)
            result=choice;
        else
            result=size;
        
        return result;
    }
}