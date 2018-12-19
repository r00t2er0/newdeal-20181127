package quiz10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    Map<Character, Integer> map = new HashMap<>();
    int Cnt = 1; //횟수
    int max = 0; //최대값
    char index = 0; //문자
    
    //범위
    while(true) {
      System.out.println("입력 : ");
      str = sc.nextLine();
      
      if(str.length() <= 1000000) {
        break;
      }
    }
    //대소문자
    str = str.toLowerCase();
    
    //정렬
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    str = String.valueOf(arr);
    
    //정렬 확인용
    /*System.out.println(str);*/

    //카운트
    for(int i=0; i<str.length()-1; i++) {
      //문자열이 같으면
      if(str.charAt(i) == str.charAt(i+1)) {
        Cnt++;
        //문자열이 마지막이면
        if(i == str.length()-2) {
          map.put(str.charAt(str.length()-1), Cnt);
        }
      //문자열이 다르면
      }else {
        map.put(str.charAt(i), Cnt);
        Cnt = 1;
        //문자열이 마지막이면
        if(i == str.length()-2) {
          map.put(str.charAt(str.length()-1), Cnt);
        }
      }
    }
    
    //최대값
    Iterator<Character> it = map.keySet().iterator();
    while(it.hasNext()) {
      Character key = it.next();
      
      if(map.get(key) > max) {
        max = map.get(key);
        index = key;
      }else if(map.get(key) == max) {
        index = '?';
      }
      //map 확인용
      /*System.out.printf("키 : %s, 값 : %s\n", key, map.get(key));*/
    }
    
    //출력
    System.out.print(index);
  }
}