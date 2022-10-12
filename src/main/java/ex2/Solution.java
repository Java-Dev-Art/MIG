package ex2;

public class Solution {
    public int solution(int A, int B, int K){
        int value = 0;
        for (int i = A; i <= B; i++){
            if (i % K == 0){
                value++;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1,200,30));
    }
}
