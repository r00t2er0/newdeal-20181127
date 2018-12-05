package com.eomcs.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Driver;
import com.eomcs.lms.domain.Lesson;

public class LessonDao {
  public List<Lesson> findAll() throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select lno, title, sdt, edt, tot_hr from lesson");){
    
      ArrayList<Lesson> list = new ArrayList<>();

      while (rs.next()) {
        Lesson lesson = new Lesson();
        lesson.setNo(rs.getInt("lno"));
        lesson.setTitle(rs.getString("title"));
        lesson.setStartDate(rs.getDate("sdt"));
        lesson.setEndDate(rs.getDate("edt"));
        lesson.setTotalHours(rs.getInt("tot_hr"));
        
        list.add(lesson);
      }
      return list;
      
    } catch (Exception e){
      throw e;
    } 
  }
  
  public Lesson findByNo(int no) throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
      
        Statement stmt = con.createStatement();
      
      // SQL을 서버에 전송 => 서버에서 결과를 가져올 일을 할 객체를 리턴
        ResultSet rs = stmt.executeQuery("select title, cont, sdt, edt, tot_hr, day_hr, mno"
            + " from lesson"
            + " where lno=" + no);){
      
      // dbms에서 한 개의 레코드를 가져온다.
      if (rs.next()) {
        Lesson lesson= new Lesson();
        lesson.setNo(no);
        lesson.setTitle(rs.getString("title"));
        lesson.setContents(rs.getString("cont"));
        lesson.setStartDate(rs.getDate("sdt"));
        lesson.setEndDate(rs.getDate("edt"));
        lesson.setTotalHours(rs.getInt("tot_hr"));
        lesson.setDayHours(rs.getInt("day_hr"));
        lesson.setMno(rs.getInt("mno"));
        return lesson;
      }else {
        return null;
      }
    }
  }
  
  public int insert(Lesson lesson) throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
        Statement stmt = con.createStatement();) {
      
      // SQL을 서버에 전송
      return stmt.executeUpdate("insert into lesson(title, cont, sdt, edt, tot_hr, day_hr, mno)"
          + " values('" + lesson.getTitle() + "','"
          + lesson.getContents() + "','"
          + lesson.getStartDate() + "','"
          + lesson.getEndDate() + "',"
          + lesson.getTotalHours() + ","
          + lesson.getDayHours() + "," 
          + lesson.getNo() + ")");
    }
  }
  
  public int update(Lesson lesson) throws Exception{
    DriverManager.registerDriver(new Driver());
    Connection con = null;
    Statement stmt = null;
    
    try {
      con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");
      stmt = con.createStatement();
      
      return stmt.executeUpdate("update lesson set"
          + " title='" + lesson.getTitle() + "',"
          + " cont='" + lesson.getContents() + "',"
          + " sdt='" + lesson.getStartDate() + "',"
          + " edt='" + lesson.getEndDate() + "',"
          + " tot_hr=" + lesson.getTotalHours() + ","
          + " day_hr=" + lesson.getDayHours() + ","
          + " mno=" + lesson.getMno()
          + " where lno=" + lesson.getNo());
      
    } finally {
        try {stmt.close();} catch(Exception e) {}
        try {con.close();} catch(Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception{
    Connection con = null;
    Statement stmt = null;
    
    try {
      DriverManager.registerDriver(new Driver());
      con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");
      stmt = con.createStatement();
      
      return stmt.executeUpdate("delete from lesson where lno=" + no); 
          
    } finally {
        try {stmt.close();} catch(Exception e) {}
        try {con.close();} catch(Exception e) {}
    }
  }
}
