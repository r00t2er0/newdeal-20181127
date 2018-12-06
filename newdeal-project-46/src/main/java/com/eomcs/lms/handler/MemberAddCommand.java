package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberAddCommand implements Command {
  
  Scanner keyboard;
  MemberDao memberDao;
  
  public MemberAddCommand(Scanner keyboard, MemberDao memberDao) {
    this.keyboard = keyboard;
    this.memberDao = memberDao;
  }
  
  public void execute() {
    try {
      Member member = new Member();
      
      System.out.print("이름? ");
      member.setName(keyboard.nextLine());
      
      System.out.print("이메일? ");
      member.setEmail(keyboard.nextLine());
      
      System.out.print("암호? ");
      member.setPassword(keyboard.nextLine());
      
      System.out.print("사진? ");
      member.setPhoto(keyboard.nextLine());
      
      System.out.print("전화? ");
      member.setTel(keyboard.nextLine());
      
      Date cdt = new Date(System.currentTimeMillis());
      member.setRegisteredDate(cdt);
      
      memberDao.insert(member);
      
      System.out.println("입력했습니다.");
    
    } catch (Exception e){
      e.printStackTrace();
    } 
  }
}
