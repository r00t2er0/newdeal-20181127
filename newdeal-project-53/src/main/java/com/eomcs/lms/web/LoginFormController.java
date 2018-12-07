package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import com.eomcs.lms.dao.BoardDao;

//spring IoC 컨테이너에게 이 클래스의 인스턴스를 자동 생성하도록 클래스에 표시해 둔다.
@Component("/auth/form")
public class LoginFormController implements PageController {
  BoardDao boardDao;
  
  public LoginFormController(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
    return "/auth/form.jsp";
  }
}
