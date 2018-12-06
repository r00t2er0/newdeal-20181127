package com.eomcs.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Driver;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;

public class MemberDao {
  public List<Member> findAll() throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select mno, name, email, tel, cdt from member");){
    
      ArrayList<Member> list = new ArrayList<>();

      while (rs.next()) {
        Member member = new Member();
        member.setNo(rs.getInt("mno"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setTel(rs.getString("tel"));
        member.setRegisteredDate(rs.getDate("cdt"));
        
        list.add(member);
      }
      return list;
      
    } catch (Exception e){
      throw e;
    } 
  }
  
  public Member findByNo(int no) throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
      
        Statement stmt = con.createStatement();
      
      // SQL을 서버에 전송 => 서버에서 결과를 가져올 일을 할 객체를 리턴
        ResultSet rs = stmt.executeQuery("select name,email,pwd,photo,tel from member where mno=" + no);){
      
      // dbms에서 한 개의 레코드를 가져온다.
      if (rs.next()) {
        Member member= new Member();
        member.setNo(no);
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("pwd"));
        member.setPhoto(rs.getString("photo"));
        member.setTel(rs.getString("tel"));
        return member;
      }else {
        return null;
      }
    }
  }
  
  public int insert(Member member) throws Exception{
    DriverManager.registerDriver(new Driver());
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
        "study",
        "1111");
        Statement stmt = con.createStatement();) {
      
      // SQL을 서버에 전송
      return stmt.executeUpdate("insert into member(name,email,pwd,photo,tel,cdt)"
          + " values('" + member.getName() + "','"
          + member.getEmail() + "','"
          + member.getPassword() + "','"
          + member.getPhoto() + "','"
          + member.getTel() + "','"
          + member.getRegisteredDate() + "')");
    }
  }
  
  public int update(Member member) throws Exception{
    DriverManager.registerDriver(new Driver());
    Connection con = null;
    Statement stmt = null;
    
    try {
      con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111");
      stmt = con.createStatement();
      
      return stmt.executeUpdate("update member set "
          + "name='" + member.getName() + "',"
          + "email='" + member.getEmail() + "',"
          + "pwd='" + member.getPassword() + "',"
          + "photo='" + member.getPhoto() + "',"
          + "tel='" + member.getTel() + "'"
          + " where mno=" + member.getNo());
      
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
      
      return stmt.executeUpdate("delete from member where mno=" + no); 
          
    } finally {
        try {stmt.close();} catch(Exception e) {}
        try {con.close();} catch(Exception e) {}
    }
  }
}
