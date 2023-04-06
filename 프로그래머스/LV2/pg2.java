package 프로그래머스.LV2;

public class pg2 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/176962
    //과제는 시작하기로 한 시각이 되면 시작합니다.
    //새로운 과제를 시작할 시각이 되었을 때, 기존에 진행 중이던 과제가 있다면 진행 중이던 과제를 멈추고 새로운 과제를 시작합니다.
    //진행중이던 과제를 끝냈을 때, 잠시 멈춘 과제가 있다면, 멈춰둔 과제를 이어서 진행합니다.
    //만약, 과제를 끝낸 시각에 새로 시작해야 되는 과제와 잠시 멈춰둔 과제가 모두 있다면, 새로 시작해야 하는 과제부터 진행합니다.
    //멈춰둔 과제가 여러 개일 경우, 가장 최근에 멈춘 과제부터 시작합니다.
    //과제 계획을 담은 이차원 문자열 배열 plans가 매개변수로 주어질 때, 과제를 끝낸 순서대로 이름을 배열에 담아 return 하는 solution 함수를 완성해주세요.
    public static void main(String args[]){

        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        //11:40 12:10 / 12:10 12:20 / 12:30 1:10
        //다음 과제 시작시간 <= 앞 과제 끝난 시간 : 끝
        //다음 과제 시작시간 > 앞 과제 끝난 시간 : 다음 과제 먼저 시작
        String[] eworks = new String[plans.length+1];
        int[] stimes = new int[plans.length+1];
        int[] etimes = new int[plans.length+1];

        for(int i=0;i<plans.length;i++){
            int hour = Integer.parseInt(plans[i][1].split(":")[0]);
            if(hour > 12) hour -= 12;
            int stime = hour * 60 + Integer.parseInt(plans[i][1].split(":")[1]); // 분으로;
            int etime = stime + Integer.parseInt(plans[i][2]);
            stimes[i] = stime;
            etimes[i] = etime;
        }

        for(int i=0;i<plans.length;i++){
           for(int j=i+1;j<plans.length;j++){
               if(stimes[i] >= etimes[j]) {
                   eworks[i] = plans[i][0];
               }
           }
        }

        while (true) {

            if(eworks.length == plans.length) break;
        }

        for(int i=0;i<eworks.length;i++){
            System.out.println(eworks[i]);
        }

    }
}
