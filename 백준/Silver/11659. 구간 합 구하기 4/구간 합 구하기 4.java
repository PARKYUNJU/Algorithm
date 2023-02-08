import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();

        arr.add(0,0);
        for(int i=1;i<n+1;i++)
        {
            int a=sc.nextInt();
            arr.add(i,a);
        }
        ArrayList<Integer>sumList=new ArrayList<>();
        sumList.add(0,0);
        for(int i=0;i<arr.size()-1;i++)
        {
            sumList.add(i+1,sumList.get(i)+arr.get(i+1));

        }


        for(int i=0;i<num;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(sumList.get(b)-sumList.get(a-1));
        }
    }
}