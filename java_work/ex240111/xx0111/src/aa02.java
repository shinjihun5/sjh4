import java.util.Arrays;

public class aa02 {

    public static void main(String[] args) {
        int[] a ={90,80,100};
        int[][] score = {

                {10, 20, 30}, {40, 50, 60}};
        System.out.println(score.length);
        System.out.println(score[0].length);
        System.out.println(score[1].length);


            score[1] = a;
        System.out.println(score[1].length);
        System.out.println(Arrays.toString(score[0]));
    }

}
