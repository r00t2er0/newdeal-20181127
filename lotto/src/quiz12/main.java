package quiz12;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
 // 입력한 두 정수의 최대공약수를 구하세요.
    Gcd gcd = new Gcd();
    Scanner sc = new Scanner(System.in);
 
    System.out.print("첫번째 정수를 입력하세요 : ");
    int x = sc.nextInt();
    System.out.print("두번째 정수를 입력하세요 : ");
    int y = sc.nextInt();
 
    System.out.println("최대공약수는 " + gcd.calc(x, y) + "입니다.");
 
    /*
     * Console 예시 
     * 첫번째 정수를 입력하세요 : 48  2*2*2*2*3
     * 두번째 정수를 입력하세요 : 36  2*2*3*3
     * 최대공약수는 12입니다.
     */

  }

}
