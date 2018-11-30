package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {
  
  Scanner keyboard;
  List<Member> list;
  
  public MemberHandler(Scanner keyboard, List<Member> list) {
    this.keyboard = keyboard;
    this.list = list;
  }
  
  public void listMember() {
    
  }

  public void addMember() {
    
  }

  public void detailMember() {
    
  }
  
  public void updateMember() {
    
  }
  
  public void deleteMember() {
    
  }
  
  private int indexOfMember(int no) {
    for (int i = 0; i < list.size(); i++) {
      Member m = list.get(i);
      if (m.getNo() == no)
        return i;
    }
    return -1;
  }
}
