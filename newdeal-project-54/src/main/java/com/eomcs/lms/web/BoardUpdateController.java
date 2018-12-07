package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

//spring IoC 컨테이너에게 이 클래스의 인스턴스를 자동 생성하도록 클래스에 표시해 둔다.
@Controller
public class BoardUpdateController{
  BoardDao boardDao;
  
  public BoardUpdateController(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  
  @RequestMapping("/board/update")
  public String update(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
      Board board = new Board();
      board.setNo(Integer.parseInt(request.getParameter("no")));
      board.setContents(request.getParameter("contents"));

      boardDao.update(board);
      response.setContentType("text/html;charset=UTF-8");
      
      // 데이터를 변경한 후 웹 브라우저에게 목록 URL을 다시 요청 하라고 응답한다.
      return "list";
      
    } 
}

