package com.eomcs.lms.handler;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonAddCommand implements Command {
  
  Scanner keyboard;
  LessonDao lessonDao;
  
  public LessonAddCommand(Scanner keyboard, LessonDao lessonDao) {
    this.keyboard = keyboard;
    this.lessonDao = lessonDao;
  }
  
  public void execute() {
    try {
      Lesson lesson = new Lesson();
  
      System.out.print("수업명? ");
      lesson.setTitle(keyboard.nextLine());
  
      System.out.print("설명? ");
      lesson.setContents(keyboard.nextLine());
  
      System.out.print("시작일? ");
      Date startDate = Date.valueOf(keyboard.nextLine());
      lesson.setStartDate(startDate);
      
      System.out.print("종료일? ");
      Date endDate = Date.valueOf(keyboard.nextLine());
      lesson.setEndDate(endDate);
  
      System.out.print("총수업시간? ");
      lesson.setTotalHours(Integer.parseInt(keyboard.nextLine()));
  
      System.out.print("일수업시간? ");
      lesson.setDayHours(Integer.parseInt(keyboard.nextLine()));
      
      System.out.print("강사? ");
      lesson.setNo(Integer.parseInt(keyboard.nextLine()));
  
      lessonDao.insert(lesson);
      
      System.out.println("저장하였습니다.");
      
    }catch (Exception e){
      e.printStackTrace();
    } 
  }
}
