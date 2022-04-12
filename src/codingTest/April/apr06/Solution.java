package codingTest.April.apr06;

class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    static void dfs(int[] num, int target, int sum, int i){
        if(num.length == i){
            if(target == sum){
                answer++;
            }
            
            if(target < 1){
                return;
            }
            return;
        }
        
        dfs(num, target, sum + num[i], i + 1);
        dfs(num, target, sum - num[i], i + 1);
    }
}