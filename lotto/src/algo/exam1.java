package algo;

import java.util.Scanner;

public class exam1 {

  public static void main(String[] args) {
    System.out.printf("별 갯수를 입력하세요");
    int num = Integer.parseInt(new Scanner(System.in).next());
    new StarCreate().getStar(num);

  }

}
