package stringExam;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";

    while(true) {
      str = sc.next();
      
      if(chk(str) || chk2(str)) {
        chk3(str);
      }else {
        System.out.println("입력값이 잘못되었습니다.");
      }
    }
  }
  //1.자리수 체크
  static boolean chk(String str) {
    return (str.length() == 14) ? true :false; 
  }
  //2.뒷번호 첫번째 자리값 1~4 허용 체크
  static boolean chk2(String str) {
    char gen = str.charAt((str.indexOf("-")+1));
    if(gen > 0 && gen <5) {
      return true;
    }else {
      return false;
    }
  }
  //3.뒷번호 첫번째 자리 1,3 = 남자, 2,4 = 여자 출력기능
  static void chk3(String str) {
    char gen = str.charAt((str.indexOf("-")+1));
    switch(gen) {
      case '1' :
      case '3' :
        System.out.println("남");
        break;
      case '2' :
      case '4' :
        System.out.println("여");
        break;
        default:
          System.out.println("입력값이 잘못되었습니다.");
    }
  }
}
