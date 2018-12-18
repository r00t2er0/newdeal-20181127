package quiz9;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("문자 입력 >> ");
    String str = sc.nextLine();
    StringCompress compress = new StringCompress();
    compress.compress(str);

  }

}
