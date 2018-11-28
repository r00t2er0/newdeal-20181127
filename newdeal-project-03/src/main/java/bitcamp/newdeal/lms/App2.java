package bitcamp.newdeal.lms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    final int DEFAULT_SIZE = 20;
    int no[] = new int[DEFAULT_SIZE];
    String name[] = new String[DEFAULT_SIZE];
    String email[] = new String[DEFAULT_SIZE];
    String pwd[] = new String[DEFAULT_SIZE];
    String pic[] = new String[DEFAULT_SIZE];
    String phone[] = new String[DEFAULT_SIZE];
    
    int len=0;
    
    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd",Locale.KOREA);
    Date current = new Date();
    String day = date.format(current);
    
    Scanner keyIn = new Scanner(System.in);
    
    for(int i=0; i<DEFAULT_SIZE; i++) {
      System.out.printf("번호?");
      no[i] = Integer.parseInt(keyIn.nextLine());

      System.out.printf("이름?");
      name[i] = keyIn.nextLine();

      System.out.print("이메일?");
      email[i] = keyIn.nextLine();

      System.out.print("암호?");
      pwd[i] = keyIn.nextLine();

      System.out.print("사진?");
      pic[i] = keyIn.nextLine();

      System.out.print("전화?");
      phone[i] = keyIn.nextLine();
      
      len++;
      
      System.out.println("계속하시겠습니까?(Y/n)");
      String input = keyIn.nextLine();
      if(input.equals("") || input.equalsIgnoreCase("y")) {
        continue;
      }
      break;
    }
    keyIn.close();
    
    for(int i=0; i<len; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
          no[i],
          name[i],
          email[i],
          pwd[i],
          pic[i],
          phone[i],
          day
          );
    }
  }

}
