package xx0111;

public class xx10 {

	class Solution {
	    public String solution(String my_string, int k) {
	        return my_string.repeat(k);
	    }
	        public static void main(String[] args) {
	            Solution solution = new Solution();

	            String resultString = solution.solution("string", 3);
	            String resultLove = solution.solution("love", 10);

	            System.out.println(resultString);
	            System.out.println(resultLove);
	        }
	

}
