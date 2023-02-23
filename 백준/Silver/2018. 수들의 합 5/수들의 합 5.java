import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
             Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=1;
        int start=1; int end=1;

        int sum=1;


        while(end!=n)
        {

            if(sum==n)
            {
                count++;
                end++;
                sum+=end;
            }
            else if(sum>n)
            {
                sum-=start; //부분합을 구하는 과정. 현재까지 누적합 - 앞에 인덱스 (중요*****)
                start++;
            }
            else {
                end++;
                sum+=end; //굳이 부분합을 구하지 않아도 인덱스를 sum에 더해가는게 누적합임.

            }




        }

        System.out.println(count);


        /* 처음 짰던 코드의 문제점
        부분합을 subSum(int a, int b)라고 따로 외부 함수를 만들어서 호출하고,
        메인 함수에서는 while(true)로 무한루프 돌려놓고 end가 끝까지 가면 break 하는식으로 했는데 while(end!=n)이랑 시간복잡도 차이가 있는지 궁금하다
         */
    }
}