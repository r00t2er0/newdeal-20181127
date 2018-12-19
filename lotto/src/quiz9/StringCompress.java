package quiz9;

public class StringCompress {

  void compress(String str) {
    String comstr = "";
    int Cnt = 1;
    
    //카운트
    for(int i=0; i<str.length()-1; i++) {
      if(str.charAt(i) == str.charAt(i+1)) {
        Cnt++;
        if(i == str.length()-2) {
          comstr += str.charAt(str.length()-1);
          comstr += Cnt;
        }
      }else if(str.charAt(i) != str.charAt(i+1)){
        comstr += str.charAt(i);
        comstr += Cnt;
        Cnt = 1;
        if(i == str.length()-2) {
          comstr += str.charAt(str.length()-1);
          comstr += Cnt;
        }
      }
    }
    
    //출력
    System.out.println(comstr);
  }
}
