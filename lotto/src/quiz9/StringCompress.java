package quiz9;

import java.util.Arrays;

public class StringCompress {

  void compress(String str) {
    
    String s = "";
    int Cnt = 1;
    
    s += str.charAt(0);
    for(int i=1; i<str.length(); i++) {
      if(str.charAt(i-1) == str.charAt(i)){
        Cnt++;
      }else {
        s += Cnt;
        s += str.charAt(i);
        Cnt = 1;
      }
    }
    s += Cnt;
    System.out.println(s);
  }
}
