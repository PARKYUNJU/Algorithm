import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();

        int start=0;
        int end=1; int count=0;
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());

        }

        Collections.sort(arr);
//        System.out.println(arr);
//        System.out.println(arr.get(0)+" "+arr.get(1));
//        System.out.println(arr.size());
        while(start!=arr.size()-1)
        {
            int a=arr.get(start)+arr.get(end);
            if(a==ans) //1부터 끝까지 더하다가 정답 나오면
            {
                count++;
                start++; //시작점 한 칸 옮기고 2부터 다시시작
                end=start+1; //3부터 더해가기

            }
            else if(end==arr.size()-1)//마지막 점이 끝까지 왔으면
            {
                start++; //시작점 한 칸 옮기고
                end=start+1; //거기서부터 (시작점+1 점 부터) 다시 시작
            }
            else
            {
                end++; //쭉쭉 더해가기
            }
        }

        System.out.println(count);


    }


}

