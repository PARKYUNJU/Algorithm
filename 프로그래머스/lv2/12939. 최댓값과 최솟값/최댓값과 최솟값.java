import java.util.*;
class Solution {
    public String solution(String s) {
        String []arr=s.split(" ");
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(newarr);
        String answer=Integer.toString(newarr[0])+" "+Integer.toString(newarr[arr.length-1]);
        return answer;
    }
}