package com.eomcs.lms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

//spring IoC 컨테이너에게 이 클래스의 인스턴스를 자동 생성하도록 클래스에 표시해 둔다.
@Component("/auth/logout")
public class LogoutController implements PageController {
  
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws Exception {

    request.getSession().invalidate();
    return "redirect:login";
  }
}
