package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;

public class LessonDeleteCommand implements Command {
  
  Scanner keyboard;
  LessonDao lessonDao;
  
  public LessonDeleteCommand(Scanner keyboard, LessonDao lessonDao) {
    this.keyboard = keyboard;
    this.lessonDao = lessonDao;
  }
  
  public void execute() {
    try {
      System.out.print("번호? ");
      int no = Integer.parseInt(keyboard.nextLine());
      
      if(lessonDao.delete(no) > 0) {
        System.out.println("삭제했습니다.");
      }else {
        System.out.println("해당 번호의 게시물이 없습니다.");
      }
    
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
