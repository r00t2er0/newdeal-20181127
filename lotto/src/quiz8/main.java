package quiz8;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    int Cnt = 0; // 유저 올라간 계단 수
    int Cnt2 = 0; // 컴퓨터 올라간 계단 수
    String[] str = {"가위", "바위", "보"};
    char win = 0; //승,패 저장
    
    while(true) {
      Cnt = 0;
      Cnt2 = 0;
      System.out.println("계단 수? ");
      Scanner sc = new Scanner(System.in);
      int lay = sc.nextInt(); // 계단 수
      sc.nextLine();
      
      while(lay > Cnt && lay > Cnt2) {
        // 유저
        System.out.println("가위,바위,보? ");
        String inp = sc.nextLine(); 
        
        // 컴퓨터
        int ran = (int) (Math.random()*2);
        System.out.println(str[ran]);
        
        // 같으면 무승부
        if(str[ran].equals(inp)) {
          System.out.println("무승부");
        // 무승부가 아닐경우
        }else {
          switch(inp) {
            case "가위":
              if(ran > 1) {
                System.out.println("승");
                Cnt += 2;
              }else {
                System.out.println("패");
                Cnt2 += 2;
              }
              break;
            case "바위":
              if(ran < 1) {
                System.out.println("승");
                Cnt += 3;
              }else {
                System.out.println("패");
                Cnt2 += 3;
              }
              break;
            case "보":
              if(ran > 0) {
                System.out.println("승");
                Cnt += 5;
              }else {
                System.out.println("패");
                Cnt2 += 5;
              }
              break;
          }
        }
        
        System.out.printf("유저 %d, 컴 %d \n", Cnt, Cnt2);
        } // 안 while
      System.out.println("다시 하시겠습니까?(y/n)");
      if(sc.nextLine().equals("n")) {
        System.out.println("게임 종료");
        break;
      }
    } // 밖 while
  }
}