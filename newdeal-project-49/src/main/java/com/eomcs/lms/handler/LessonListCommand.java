package com.eomcs.lms.handler;

import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonListCommand implements Command {
  
  Scanner keyboard;
  LessonDao lessonDao;
  
  public LessonListCommand(Scanner keyboard, LessonDao lessonDao) {
    this.keyboard = keyboard;
    this.lessonDao = lessonDao;
  }
  
  public void execute() {
    try {
      List<Lesson> list = lessonDao.findAll();
      
      for(Lesson lesson : list) {
        System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
            lesson.getNo(), lesson.getTitle(),
            lesson.getStartDate(), lesson.getEndDate(),
            lesson.getTotalHours());
      }
      
    } catch(Exception e) {
      e.printStackTrace();
    } 
  }
}
