package bitcamp.newdeal.lms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd",Locale.KOREA);
    Date current = new Date();
    String day = date.format(current);
    
    Scanner keyIn = new Scanner(System.in);
    
    System.out.printf("번호?");
    int no = Integer.parseInt(keyIn.nextLine());
    
    System.out.printf("이름?");
    String name = keyIn.nextLine();
    
    System.out.print("이메일?");
    String email = keyIn.nextLine();
    
    System.out.print("암호?");
    String pwd = keyIn.nextLine();
    
    System.out.print("사진?");
    String pic = keyIn.nextLine();
    
    System.out.print("전화?");
    String phone = keyIn.nextLine();

    keyIn.close();
    
    System.out.print("번호:" + no);
    System.out.printf(" 이름: %s", name);
    System.out.printf(" 이메일: %s", email);
    System.out.printf(" 암호: %s", pwd);
    System.out.printf(" 사진: %s", pic);
    System.out.printf(" 전화: %s", phone);
    System.out.printf(" 가입일: %s", day);
  }

}
