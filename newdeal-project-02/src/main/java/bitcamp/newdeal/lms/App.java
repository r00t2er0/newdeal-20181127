package bitcamp.newdeal.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        
        System.out.println("번호?");
        int no = Integer.parseInt(keyIn.nextLine());
        
        System.out.println("수업명?");
        String title = keyIn.nextLine();
        
        System.out.println("내용?");
        String contents = keyIn.nextLine();
        
        System.out.println("강의시작일?");
        Date startDate = Date.valueOf(keyIn.nextLine());
        
        System.out.println("강의종료일?");
        Date endDate = Date.valueOf(keyIn.nextLine());
        
        System.out.println("총강의시간?");
        int totalHours = Integer.parseInt(keyIn.nextLine());
        
        System.out.println("일강의시간?");
        int dayHours = Integer.parseInt(keyIn.nextLine());
        
        keyIn.close();
        
        System.out.println("번호: " + no);
        System.out.printf("수업명: %s\n", title);
        System.out.printf("내용: %s\n", contents);
        System.out.printf("시작일: %s\n", startDate);
        System.out.printf("종료일: %s\n", endDate);
        System.out.printf("총수업시간: %d\n", totalHours);
        System.out.printf("일수업시간: %d\n", dayHours);
    }
}
