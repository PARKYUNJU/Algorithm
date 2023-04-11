import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        ArrayList<Integer> new_lost=new ArrayList<>();
        ArrayList<Integer> new_reserve=new ArrayList<>();

        
        for(int i=0;i<reserve.length;i++)
        {
            new_reserve.add(Integer.valueOf(reserve[i]));
        }
        for(int i=0;i<lost.length;i++)
        {
            if(new_reserve.contains(Integer.valueOf(lost[i])))
            {
                new_reserve.remove(Integer.valueOf(lost[i]));
            }
            else
                new_lost.add(Integer.valueOf(lost[i]));
        }
        
        Collections.sort(new_reserve);
        Collections.sort(new_lost);
        
        int answer=n;

        int index=0;
        int not=new_lost.size();
        
        for(int i=0;i<new_lost.size();i++)
        {
            for(int j=0;j<new_reserve.size();j++)
            {
                
                if(Math.abs(new_lost.get(i)-new_reserve.get(j))==1)
                {
                    not-=1;
                    new_reserve.remove(j);

                }
            }

        }
        return answer-not;
        

    }

}
    

