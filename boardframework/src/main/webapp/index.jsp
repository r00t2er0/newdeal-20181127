<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bit.member.model.MemberDto"%>
<%
MemberDto memberDto = new MemberDto();
memberDto.setId("GrayHat");
memberDto.setName("김준효");
memberDto.setEmail("hermes9003@naver.com");

session.setAttribute("userInfo", memberDto);

response.sendRedirect(request.getContextPath() + "/badmin/boardmenu.bit");
%>