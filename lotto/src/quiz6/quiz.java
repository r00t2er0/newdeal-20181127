package quiz6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class quiz {
  static int solution(int n) {
    List list = new ArrayList(); //이진수값 담는 배열
    List list2 = new ArrayList(); //이진 간격 값 담는 배열
    int zCnt = 0; //0의 회수 카운트하는 변수
    int oCnt = 0; //1의 회수 카운트하는 변수
    int Cnt = 0; //이진간격 카운트하는 변수
    
    //매개변수값을 이진수로 변환
    while(true) {
      list.add(n % 2);
      n = n / 2;
      
      if(n == 0) {
        break;
      }
    }
    
    //이진간격 카운트
    Iterator it = list.iterator();
    while(it.hasNext()) {
      int val = (int) it.next();
      /*System.out.print(val);*/
      if(val == 0) {
        zCnt++;
      }else {
        // 1이 짝수번 나오면 이진간격(Cnt)을 배열에 넣음
        if(oCnt >= 1) {
          oCnt++;
          //이진 간격 값 배열에 넣음
          list2.add(zCnt);
          zCnt = 0;
        }else {
          oCnt++;
          zCnt = 0;
        }
      }
    }

    if(oCnt < 2) {
      Cnt = 0;
    }else {
      Cnt = (int) Collections.max(list2);
    }
    
    return Cnt;
  }

  public static void main(String[] args) {
    System.out.println("해당 숫자의 이진 간격은 "+ solution(32));
  }
}