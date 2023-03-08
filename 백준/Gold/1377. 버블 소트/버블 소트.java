import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더에 익숙햊기ㅣ

        int n = Integer.parseInt(bf.readLine());
        data[] arr = new data[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(bf.readLine()); //데이터 입력받기
            arr[i] = new data(a, i );

        }
        int max = 0;

        Arrays.sort(arr); //data 클래스 안에 정의해놓은 compareTo 메소드 기준으로 정렬
        //data 안에 value를 오름차순으로 정렬

//        for(int i=0;i<n;i++)
//        {
//            System.out.println(arr[i].index);
//        }
        for (int i = 0; i < n; i++) {
            if (max < arr[i].index - i)
                max = arr[i].index - i;
        }
//
        System.out.print(max + 1);
    }


}


class data implements Comparable<data> {
    int value;
    int index;

    public data(int v, int i) {
        this.index = i;
        this.value = v;

    }


    @Override
    public int compareTo(data o) {
        return this.value - o.value; //????
    }
}


