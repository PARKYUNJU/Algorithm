import java.util.*;


class Solution {
    static int[] lengthArr; //반복되는 횟수 넣기
    static String[] splitString; //자른 문자열 넣기

    static int count; //반복 횟수
    
    
    public int solution(String s) {
         int answer=s.length();
        for(int i=1;i<s.length()/2+1;i++)
        {
            answer= Math.min(answer,splitFunction(s,i));
        }
        return answer;
    }
    
    
     public int splitFunction(String s,int cut)
    {
        count=0;
        StringBuilder sb=new StringBuilder();
        splitString = s.split("(?<=\\G.{" + cut + "})");
        lengthArr=new int[splitString.length];

        for(int i=1;i<splitString.length;i++)
        {
            if(splitString[i].equals(splitString[i-1]))
            {
                count++;
            }
            else{
                lengthArr[i-1]=count;
                count=0;
            }


        }
        lengthArr[splitString.length-1]=count; //마지막에 넣을수있게 처리해주기



        for(int i=0;i<lengthArr.length;i++)
        {
            if(lengthArr[i]!=0)
            {
                sb.append(Integer.toString(lengthArr[i]+1));
                Arrays.fill(splitString,i-lengthArr[i],i,""); //원하는 부분 배열 초기화
            }
        }


        for(int i=0;i<splitString.length;i++)
        {
            sb.append(splitString[i]);
        }

       return sb.toString().length();

    }
}