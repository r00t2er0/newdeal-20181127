package com.eomcs.lms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import org.mariadb.jdbc.Driver;

public class LessonUpdateCommand implements Command {
  
  Scanner keyboard;
  
  public LessonUpdateCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  public void execute() {
    
    Connection con = null;
    Statement stmt = null;
    
    try {
      DriverManager.registerDriver(new Driver());
      con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");
      stmt = con.createStatement();
      
      System.out.print("번호? ");
      String no = keyboard.nextLine();
      
      ResultSet rs = stmt.executeQuery(
          "select title,cont,sdt,edt,tot_hr,day_hr,mno from lesson where lno=" + no);
      rs.next();
      String oldTitle = rs.getString("title");
      String oldCont = rs.getString("cont");
      String oldSdt = rs.getString("sdt");
      String oldEdt = rs.getString("edt");
      String oldTot_hr = rs.getString("tot_hr");
      String oldDay_hr = rs.getString("day_hr");
      String oldMno = rs.getString("mno");
      rs.close();
      
      System.out.printf("수업명(%s)? ", oldTitle);
      String title = keyboard.nextLine();
      System.out.printf("설명(%s)? ", oldCont);
      String cont = keyboard.nextLine();
      System.out.printf("시작일(%s)? ", oldSdt);
      String sdt = keyboard.nextLine();
      System.out.printf("종료일(%s)? ", oldEdt);
      String edt = keyboard.nextLine();
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
