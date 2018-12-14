package quiz5;

import java.util.Arrays;

public class Anagram {
  String chk(String first, String second) {
    
    // 길이 비교
    if(first.length() == second.length()) {
      char[] fir = new char[first.length()];
      char[] sec = new char[second.length()];
      
      for(int i=0; i<first.length(); i++) {
        fir[i] = first.charAt(i);
      }
      
      for(int i=0; i<second.length(); i++) {
        sec[i] = second.charAt(i);
      }
      
      //정렬
      Arrays.sort(fir);
      Arrays.sort(sec);
      
      //값비교
      for(int i=0; i<first.length(); i++) {
        if(fir[i] != sec[i]) {
          //값이 다르면
          return "no";
        }
      }
    }else {
      //길이가 다르면
      return "no";
    }
    //길이와 값이 다르지 않다면
    return "yes";
  }
}
