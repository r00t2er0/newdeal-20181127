package oopEaxm;

public class Shape {
  String color="black";
  
  void draw() {
   System.out.println("그리다");
  }
  
  class Point{
    int x;
    int y;
    
    Point(){
     //this.x = 1;
     //this.y = 2;
     this(1,2);
    }
    Point(int x , int y){
     this.x = x;
     this.y = y;
    }
  }
}