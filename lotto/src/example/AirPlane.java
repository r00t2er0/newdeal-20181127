package example;

public class AirPlane {
  String name;
  int num;
  static int count = 0;

  public AirPlane(String name, int num){
    this.name = name;
    this.num = num;
    count++;
  }
  
  public void info() {
    System.out.printf("이름: %s ",name);
    System.out.printf("번호: %d",num);
    System.out.println();
  }
  
  public static void count() {
    System.out.println(count);
  }
}
