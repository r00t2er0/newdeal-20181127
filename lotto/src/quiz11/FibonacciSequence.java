package quiz11;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

  void calc(int number) {
    
    List<Integer> list = new ArrayList();
    list.add(0);
    list.add(1);
    
    for(int i=0; i<number; i++) {
      int sum = list.get(i) + list.get(i+1);
      list.add(sum);
      /*System.out.printf("%d : %d\n",i,list.get(i));*/
    }
    
    System.out.printf("피보나치 %d번째 수는 %d입니다.", number,list.get(number));
  }
}
