package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  static final int LENGTH = 10;
  
  static Scanner keyboard;
  Lesson[] lessons = new Lesson[LENGTH];
  int lessonIdx = 0;
  
  public LessonHandler(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  public void listLesson() {
    for (int j = 0; j < lessonIdx; j++) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          this.lessons[j].no, this.lessons[j].title, this.lessons[j].startDate, 
          this.lessons[j].endDate, this.lessons[j].totalHours);
    }
  }

  public void addLesson() {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.no = Integer.parseInt(keyboard.nextLine());

    System.out.print("수업명? ");
    lesson.title = keyboard.nextLine();

    System.out.print("설명? ");
    lesson.contents = keyboard.nextLine();

    System.out.print("시작일? ");
    lesson.startDate = Date.valueOf(keyboard.nextLine());

    System.out.print("종료일? ");
    lesson.endDate = Date.valueOf(keyboard.nextLine());

    System.out.print("총수업시간? ");
    lesson.totalHours = Integer.parseInt(keyboard.nextLine());

    System.out.print("일수업시간? ");
    lesson.dayHours = Integer.parseInt(keyboard.nextLine());

    // i 번째 배열에 수업 정보를 담고 있는 Lesson 객체(의 주소)를 보관한다.
    this.lessons[lessonIdx] = lesson;
    this.lessonIdx++;

    System.out.println("저장하였습니다.");
  }
}
