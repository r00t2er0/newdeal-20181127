package lotto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class lotto {
  
  //로또 추출
  public static int[] number() {
  int[] lotto = new int[6];
  int temp = 0;
  
  //랜덤수 배열에 저장
  for(int i=0; i<6; i++) {
      lotto[i] = (int)(Math.random()*45)+1;
  }
  
  //중복확인
  for(int i=0; i<lotto.length-1; i++) {
    for(int j=i+1; j<lotto.length; j++) {
      if(lotto[i] == lotto[j]) {
        /*System.out.println("중복발생");*/
        lotto[i] = (int)(Math.random()*45)+1;
      }
    }
  }
  
  //정렬
  for(int i=0; i<lotto.length-1; i++) {
    for(int j=i+1; j<lotto.length; j++) {
      if(lotto[i] > lotto[j]) {
        temp = lotto[i];
        lotto[i] = lotto[j];
        lotto[j] = temp;
      }
    }
  }
  
  for(int i=0; i<lotto.length; i++) {
    System.out.println(lotto[i]);
  }

  return lotto;
  }
  
  //파일 출력
  public static void fO(int[] num) throws IOException {
    FileOutputStream FO = new FileOutputStream("C:\\Users\\USER\\Desktop\\test.txt", true);
    
    for(int i =0; i<6;i++) {
      FO.write(num[i]);
    }
    FO.close();
  }
}
