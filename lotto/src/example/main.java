package example;

public class main {

  public static void main(String[] args) {
    AirPlane a = new AirPlane("a",1);
    AirPlane b = new AirPlane("b",2);
    AirPlane c = new AirPlane("c",3);
    AirPlane d = new AirPlane("d",4);

    a.info();
    b.info();
    
    a.count();
  }

}
