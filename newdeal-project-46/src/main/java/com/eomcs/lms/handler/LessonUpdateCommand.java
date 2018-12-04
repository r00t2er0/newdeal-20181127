package com.eomcs.lms.handler;

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
      lesson.setStartDate(keyboard.nextLine());
      System.out.printf("종료일(%s)? ", lesson.getEndDate());
      lesson.setEndDate(keyboard.nextLine());
      System.out.printf("총수업시간(%s)? ", oldTot_hr);
      String tot_hr = keyboard.nextLine();
      System.out.printf("일수업시간(%s)? ", oldDay_hr);
      String day_hr = keyboard.nextLine();
      System.out.printf("강사(%s)? ", oldMno);
      String mno = keyboard.nextLine();
          
      stmt.executeUpdate("update lesson set "
          + "title='" + title + "',"
          + "cont='" + cont + "',"
          + "sdt='" + sdt + "',"
          + "edt='" + edt + "',"
          + "tot_hr=" + tot_hr + ","
          + "day_hr=" + day_hr + ","
          + "mno=" + mno
          + " where lno=" + no);
      
      System.out.println("변경했습니다.");
    
    } catch (Exception e){
      e.printStackTrace();
    } finally {
        try {stmt.close();} catch(Exception e) {}
        try {con.close();} catch(Exception e) {}
    }
  }
}
