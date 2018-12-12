package quiz3;

import java.util.Random;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int ran = rd.nextInt(100);
    
    boolean rst = true;
    int num = 0;
    
    // y or n
    while(rst) {
      //숫자 입력
      System.out.println("숫자를 입력해 주세요(0~99)");
      num = sc.nextInt();

      //입력값 0~99 확인
      if(num < 0 || num > 99) {
        System.out.println("다시 입력해주세요.");
      }else {
        if(num > ran) {
          System.out.println("입력값이 큼");
        }else if(num < ran) {
          System.out.println("입력값이 작음");
        }else {
          System.out.println("정답입니다. restart?(Y,N)");
          if(sc.next().equals("n")) {
            //종료
            rst = false;
            System.out.println("종료");
          }else{
            //랜덤 새로운값으로 변경
            ran = rd.nextInt(100);
          }
        }
      }
    }
  }
}
