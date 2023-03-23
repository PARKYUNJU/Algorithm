import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {

        int answer = -1;
        int cnt1=0,cnt2=0;
        long sum=0,sum1=0,sum2=0;

        Queue<Integer> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();


        for(int i=0;i<arr1.length;i++)
        {
            queue1.add(arr1[i]);
            sum1+=arr1[i];
            queue2.add(arr2[i]);
            sum2+=arr2[i];
            sum=sum1+sum2;
        }

        sum/=2;

        while(cnt1<arr1.length*2&&cnt2<arr1.length*2) //둘다 같은 값이 아닐 때
        {

            if(sum1==sum) {
                break;
            }
            if(sum1>sum)
            {
                sum1-=queue1.peek();
                sum2+=queue1.peek();
                queue2.add(queue1.poll());
                cnt1++;
            }
            else {
                sum1+=queue2.peek();
                sum2-=queue2.peek();
                queue1.add(queue2.poll());
                cnt2++;
            }


        }
        if(cnt1>=arr1.length*2)
            return -1;
        else
        {
            answer=cnt1+cnt2;
            return answer;
        }
    }
}
