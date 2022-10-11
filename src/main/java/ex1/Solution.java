package ex1;

import com.sun.jdi.Value;

public class Solution {
    static char [] nums;
    public int solution (int n){
        int value = 0;
        String num = String.valueOf(n);
        nums = num.toCharArray();
        if (nums.length <= 2){
            for (char c : nums){
                if (c != '-') {
                    value = 1;
                    break;
                }
            }
        } else if (nums.length < 4) {
            for (char c : nums){
                if (c != '-' ){
                    for (int i = 0; i < nums.length-1; i++){
                        if (c == nums[i]) {
                            value = 1;
                            break;
                        }
                    }
                }
            }
        } else {
            for (char c : nums){
                if (c != '-' & c != '0'){
                    value++;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(444));
    }
}
