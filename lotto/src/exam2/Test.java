package exam2;

import java.util.Scanner;

public class Test {

  public void input() {
    //입력할 수의 개수
    int num = Integer.parseInt(new Scanner(System.in).next());
    int[] list = new int[num];
    int temp = 0;
    int test = 0;
    
    //숫자 입력
    for(int i=0; i<num; i++) {
      System.out.printf("%d 번째 수를 입력하세요: ", i+1);
      test = Integer.parseInt(new Scanner(System.in).next());
      
      //10이하의 값 테스트
      if(test > 10) {
        System.out.println("10이하의 값으로 입력해주세요");
        i--;
      }else {
        //중복체크
        for(int j=0; j<=i; j++) {
          if(list[j] == test) {
            System.out.println("중복입니다.");
            i--;
            break;
          }else {
            list[i] = test;
            System.out.println("값이 입력되었습니다.");
            break;
          }
        }
      }
    }
    
    //정렬
    for(int i=0; i<num-1; i++) {
      for(int j=i+1; j<num; j++) {
        if(list[i] > list[j]) {
          temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }
    
    //확인
    for(int i=0; i<num; i++) {
      System.out.printf("%d, ",list[i]);
    }
  }
}
