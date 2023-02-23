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
//            System.out.println("현재 start"+start);
//            System.out.println("현재 end"+end);s

            if(sum==n)
            {
                count++;
                end++;
                sum+=end;
            }
            else if(sum>n)
            {
                sum-=start;

                start++;
            }
            else {
                end++;
                sum+=end;

            }




        }

        System.out.println(count);
    }
}