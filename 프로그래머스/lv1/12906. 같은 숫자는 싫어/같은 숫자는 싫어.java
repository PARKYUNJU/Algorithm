import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer>array=new ArrayList<>();
        array.add(Integer.valueOf(arr[0]));
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                array.add(Integer.valueOf(arr[i]));
            }
        }
        int[] answer = new int[array.size()];

        for(int i=0;i<array.size();i++)
        {
            answer[i]=array.get(i).intValue();
        }
        
        
        

        return answer;
    }
}