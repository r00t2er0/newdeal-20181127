package quiz14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Robot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("로봇이 걸어갈 거리를 입력해주세요.>>");
    int n = Integer.parseInt(sc.nextLine());
    System.out.println("경우의 수 " + walk(n)+" 개"); 
 }

  private static int walk(int n) {
    
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    
    for(int i=0; i<n; i++) {
      int temp = list.get(i) + list.get(i+1);
      list.add(temp);
    }
    
    return list.get(n-1);
  } 
} 
