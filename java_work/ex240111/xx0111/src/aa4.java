public class aa4 {

    /*
    String
    번호 이름                국 영 수
    [0]["홍길동"] = [100],[80],[90]
    [1]["이길동"] = [70],[90],[100]
    [2]["박길동"] = [80],[70],[200]


     */

    public static void main(String[] args) {
        String[] student1 = {"홍길동", "80", "100", "90"};
        String[] student2 = {"이길동", "70", "90", "100"};
        String[] student3 = {"박길동", "80", "70", "100"};

        String[][] all = {student1, student2, student3};
        System.out.println("학생의 숫자 = " + all.length + "명");
        int korsum = 0;
        int engsum = 0;
        int mathsum = 0;
        for (int i = 0; i < all.length; i++) {
            korsum += Integer.parseInt(all[i][1]);
            engsum += Integer.parseInt(all[i][2]);
            mathsum += Integer.parseInt(all[i][3]);

        }

        {
            System.out.println("국어점수의 총합 =" + korsum);
            System.out.println("국어점수의 총합 =" + korsum / all.length);

            System.out.println("영어점수의 총합 =" + engsum);
            System.out.println("영어점수의 총합 =" + engsum / all.length);

            System.out.println("수학점수의 총합 =" + mathsum);
            System.out.println("수학점수의 총합 =" + mathsum / all.length);

            System.out.println("모든 점수의 평균");
        }
        System.out.println((korsum+engsum+mathsum)/9);
        //학생의 숫자, 국어평균점수, 영어평균점수, 수학평균점수
     // 모든 정수의 평균점수, 1,2,3,을 구하기
    }
}
