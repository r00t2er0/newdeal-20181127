package quiz12;

public class Gcd {

  public int calc(int x, int y) {
    
    int Cnt = 0;
    int sum = 1;
    int i = 2;
    
    while(x != 1 && y != 1) {
      while(x%i == 0 && y%i == 0) {
        x = x/i;
        y = y/i;
        Cnt++;
      }
      while(x%i == 0) {
        x = x/i;
      }
      while(y%i == 0) {
        y = y/i;
      }
      for(int j=0; j<Cnt; j++) {
        sum *= i;
      }
      //System.out.printf("x: %d, y: %d, Cnt : %d, i : %d, sum : %d\n",x ,y ,Cnt , i, sum);
      i++;
      Cnt = 0;
    }
    
    return sum;
  }

}
/*
 * Console 예시 
 * 첫번째 정수를 입력하세요 : 48  2*2*2*2*3
 * 두번째 정수를 입력하세요 : 36  2*2*3*3
 * 최대공약수는 12입니다.
 * 
 * 72 2*2*2*3*3
 * 12 2*2*3
 * 최대공약수는
 * i=2 i++ x,y / i
 */
