class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length()%n!=0)
            answer=new String[my_str.length()/n+1];
        else
            answer=new String[my_str.length()/n];

        for(int i=0;i<my_str.length()/n;i++) //6이면 2까지, 3이면 3까지
        {
            answer[i]=my_str.substring(n*i,n*(i+1));
            
            
        }
        if(my_str.length()%n!=0)
            {
                answer[my_str.length()/n]=my_str.substring((my_str.length()/n)*n);
            }
        return answer;
    }
}