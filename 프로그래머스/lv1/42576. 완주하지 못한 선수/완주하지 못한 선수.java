import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
       String answer="";
    
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<participant.length;i++)
        {
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        
        for(String c:completion)
        {
            if(map.containsKey(c))
            {
                map.replace(c,map.get(c)-1);
            }
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
    // 동일한 값이 있으면 반복문을 종료합니다.
    if(entry.getValue().equals(1)) { // 값이 null이면 NullPointerException 예외 발생
      answer = entry.getKey();
      break;
    }
  }
    
        return answer;
        
    }
}