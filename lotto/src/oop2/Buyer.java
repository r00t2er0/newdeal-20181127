package oop2;

public class Buyer {
  private int price;
  private int bonuspoint;
  
  Buyer(){
    this(2000,0);
  }
  
  Buyer(int price, int bonuspoint){
    this.price = price;
    this.bonuspoint = bonuspoint;
  }
  
  void buy(Product product) {
    price -= product.price;
    bonuspoint += product.bonuspoint;
  }
  
  @Override
  public String toString() {
    String str = "price = " + price + ", bonuspoint = " + bonuspoint; 
    return str;
  }
}
