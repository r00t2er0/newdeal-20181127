package oop4;

public class Singleton {
    private static Singleton st = new Singleton();
  
  public static Singleton getInstance() {
    return st;
  }
  
  public static void main(String[] args) {
    Singleton st = Singleton.getInstance();
    Singleton st2 = Singleton.getInstance();

    System.out.println(st);
    System.out.println(st2);
  }
}