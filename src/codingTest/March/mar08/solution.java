package codingTest.March.mar08;

import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        List<Integer> answer = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            int temp = 0;
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                temp++;
            }
            q.offer(temp);
        }
        
        int first = q.poll();
        int cnt = 1;
        int loopCnt = 0;
        for(int i : q){
            loopCnt++;
            if(first >= i){
                cnt++;
                if(loopCnt == q.size()){
                    answer.add(cnt);
                }
            } else if(first < i){
                answer.add(cnt);
                cnt = 1;
                first = i;
                if(loopCnt == q.size()){
                    answer.add(cnt);
                }
            } 
        }
        return answer;
    }
}