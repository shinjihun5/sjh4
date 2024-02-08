package xx0116;

public class xx09 {
	 public static String solution(String code) {
		  if (code == null || code.isEmpty()) {
	            return "EMPTY";
	        }

	        int mode = 0;
	        StringBuilder ret = new StringBuilder();

	        for (int idx = 0; idx < code.length(); idx++) {
	            char afs = code.charAt(idx);

	            if (mode == 0) {
	                if (afs != '1') {
	                    if (idx % 2 == 0) {
	                        ret.append(afs);
	                    }
	                } else {
	                    mode = 1;
	                }
	            } else {
	                if (afs != '1') {
	                    if (idx % 2 == 1) {
	                        ret.append(afs);
	                    }
	                } else {
	                    mode = 0;
	                }
	            }
	        }

	        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
	    }

	    public static void main(String[] args) {
	        String code = "abc1abc1abc";
	        String result = solution(code);
	        System.out.println(result);
	    }
	}