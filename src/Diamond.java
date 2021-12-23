public class Diamond {
    public static void main(String[] args){
        for(int i=0; i<4; i++) {
            // 공백 출력
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }System.out.println();

        } // 아래 삼각형
            for(int k = 4; k > 0; k--){
                for(int h=0; h<4-k; h++) {
                    System.out.print(" ");
                }
                for(int h=0; h<2*k-1; h++){
                    System.out.print("*");
                }

                System.out.println();
            }





    }
}
