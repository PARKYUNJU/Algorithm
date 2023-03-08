import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        int count=0;
        Queue<Integer> ques=new LinkedList<>();

        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            ques.add(i);

        while(ques.size()!=1)
        {
            ques.remove(); // 제일 위에 카드 제거
            ques.offer(ques.poll()); //그다음 젤 위에 있는거 밑으로 옮기기
            count++;

        }
        System.out.println(ques.poll());


    }
}
