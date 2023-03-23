import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();

        //오늘날짜
        String[] todayArr = today.split("\\."); // \\포함 안하며 .이 인식이 안됨
        int todayday = Integer.parseInt(todayArr[2]);
        int todaymonth = Integer.parseInt(todayArr[1]);
        int todayyear = Integer.parseInt(todayArr[0]);


        //계약 기간
        String[] type = new String[terms.length];
        int[] impl = new int[terms.length];
        for (int i = 0; i < terms.length; i++) {
            type[i] = terms[i].split(" ")[0];
            impl[i] = Integer.parseInt(terms[i].split(" ")[1]);
        }


        //계약 정보들
        for (int i = 0; i < privacies.length; i++) {

            String implday = privacies[i].split(" ")[0];
            String impltype = privacies[i].split(" ")[1]; //계약 타입

            int index = 0;
            for (int j = 0; j < type.length; j++) {
                if (impltype.equals(type[j])) {
                    index = j;
                    break;
                }
            }

            int realtype = impl[index];

            int year = Integer.parseInt(implday.split("\\.")[0]);
            int month = Integer.parseInt(implday.split("\\.")[1]);
            int day = Integer.parseInt(implday.split("\\.")[2]);

            int[] totaldate = afterdayCaculator(year, month, day, realtype);

            int totaldays=totaldate[0]*12*28+totaldate[1]*28+totaldate[2];
            int todaydays=todayyear*12*28+todaymonth*28+todayday;
            if(totaldays<todaydays)
                result.add(i + 1);


        }

        int[] arr = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;
    }
    
    
    
     public int[] afterdayCaculator(int year, int month, int day, int impltype) {
        int[] totaldate = new int[3];
        for (int i = 0; i < impltype * 28 - 1; i++) {
            ++day;
            if (day == 29) { //day==28일로하면 28일은 카운트 안되고 넘어감
                day = 1;
                month++;
            }
            if (month == 13) {
                day = 1;
                month = 1;
                year++;
            }
        }
        totaldate[0] = year;
        totaldate[1] = month;
        totaldate[2] = day;

        return totaldate;
    }

}


