package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand implements Command {
  
  Scanner keyboard;
  LessonDao lessonDao;
  
  public LessonUpdateCommand(Scanner keyboard, LessonDao lessonDao) {
    this.keyboard = keyboard;
    this.lessonDao = lessonDao;
  }
  
  public void execute() {
    try {
      System.out.print("번호? ");
      String no = keyboard.nextLine();
      
      Lesson lesson = lessonDao.findByNo(Integer.parseInt(no));
      
      System.out.printf("수업명(%s)? ", lesson.getTitle());
      lesson.setTitle(keyboard.nextLine());
      System.out.printf("설명(%s)? ", lesson.getContents());
      lesson.setContents(keyboard.nextLine());
      System.out.printf("시작일(%s)? ", lesson.getStartDate());
      Date sDate = Date.valueOf(keyboard.nextLine());
      lesson.setStartDate(sDate);
      System.out.printf("종료일(%s)? ", lesson.getEndDate());
      Date eDate = Date.valueOf(keyboard.nextLine());
      lesson.setEndDate(eDate);
      System.out.printf("총수업시간(%s)? ", lesson.getTotalHours());
      lesson.setTotalHours(Integer.parseInt(keyboard.nextLine()));
      System.out.printf("일수업시간(%s)? ", lesson.getDayHours());
      lesson.setDayHours(Integer.parseInt(keyboard.nextLine()));
      System.out.printf("강사(%s)? ", lesson.getMno());
      lesson.setMno(Integer.parseInt(keyboard.nextLine()));
      
      lessonDao.update(lesson);

      System.out.println("변경했습니다.");
    
    } catch (Exception e){
      e.printStackTrace();
    } 
  }
}
