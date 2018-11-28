package bitcamp.newdeal.lms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd", Locale.KOREA);
    Date current = new Date();
    String day = date.format(current);
    int Cnt = 0;
    Scanner keyIn = new Scanner(System.in);
    
    System.out.printf("번호?");
    int no = Integer.parseInt(keyIn.nextLine());
    
    System.out.printf("내용?");
    String contents = keyIn.nextLine();
    
    keyIn.close();
    
    System.out.print("번호" + no);
    System.out.printf(" 내용: %s", contents);
    System.out.printf(" 작성일: %s", day);
    System.out.printf(" 조회수: %s", Cnt);

  }

}
