package xx0117;

import java.util.Arrays;

public class xx06 {

	 public static void main(String[] args) {
	        int[] num_list = {2,1,6};
	        int[] result = solution(num_list);


	        // 결과 출력
	        System.out.println(Arrays.toString(result));
	    }


	    public static int[] solution(int[] num_list) {
	        int idx = num_list.length - 1;
	        int idx2 = num_list.length - 2;
	        int idx3 = num_list[idx];
	        int idx4 = num_list[idx2];

	        int result;
	        if (idx3 > idx4) {
	            result = idx3 - idx4;
	        } else {
	            result = idx3 * 2;
	        }
	        
			int[] num_lista = new int[num_list.length + 1];
	        System.arraycopy(num_list, 0, num_lista, 0, num_list.length);
	        num_lista[num_list.length] = result;
	return num_lista;
	    }
}