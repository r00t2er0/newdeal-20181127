package stack;

public class MyStack {
  private Object[] stackArr;
  private int Cnt = 0;
  
  public boolean empty() { // 스택이 비었는지 확인
    return (Cnt == 0) ? true : false;
  }
  
  public boolean full() { //스택이 풀인지 확인
    return (Cnt == stackArr.length) ? true : false;
  }
  
  public void push(Object i) {
    if(full() == false) {
      stackArr[Cnt] = i;
      Cnt++;
    }
  }
  
  public Object pop() {
    Object obj = stackArr[Cnt-1];
    if(empty() == false) {
      stackArr[Cnt-1] = null;
      Cnt--;
    }
    return obj;
  }
}
