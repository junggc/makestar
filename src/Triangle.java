public class Triangle {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){ //줄 생성
            for(int j=0; j<4-i; j++){ //삼각형 별을 출력하기 위해 공백 생성
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//        for(int i=1;i<4;i++){
//            for(int j=1;j<8;j++){
//                if(i==1 && j==4){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }if(i==2 && j==3){
//                    System.out.print("*");
//                }else if(i==2 && j==4){
//                    System.out.print("*");
//                }else if(i==2 && j==5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }if(i==3 && j==2){
//                    System.out.print("*");
//                }else if(i==3 && j==3){
//                    System.out.print("*");
//                }else if(i==3 && j==4){
//                    System.out.print("*");
//                }else if(i==3 && j==5) {
//                    System.out.print("*");
//                }else if(i==3 && j==6) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }System.out.println();
//        }
//    }
//}
//
