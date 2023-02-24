import java.util.*;

public class Main {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> stack=new Stack<>();
        int n=sc.nextInt();
        int []arr=new int[n];
        int success=1;

        int num=1;
        ArrayList<String> character=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length;i++)
        {
            int su=arr[i];
            if(su>=num)
            {
                while(su>=num)
                {
                    stack.push(num++);
                    character.add("+");
                }
                stack.pop();
                character.add("-");

            }
            else
            {
                int topnum=stack.pop(); //일단 꺼내서 확인해보자
                if(topnum>su)
                {
                    success=0;
                    System.out.println("NO");
                    break;
                }
                else {
                    character.add("-");
                }

            }

        }

        if(success==1){
            for(int i=0;i<character.size();i++){
                System.out.println(character.get(i));
            }
        }

    }
}
