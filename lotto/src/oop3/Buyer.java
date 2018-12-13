package oop3;

public class Buyer {
  private int price;
  private int bonuspoint;
  /*List<Product> cart = new ArrayList<>();*/
  Product[] cart = new Product[10];
  int count = 0;
  
  Buyer(){
    this(2000,0);
  }
  
  Buyer(int price, int bonuspoint){
    this.price = price;
    this.bonuspoint = bonuspoint;
  }
  
  void buy(Product product) {
    if(count >= 10 ) {
      System.out.println("더이상 담지 못합니다.(max:10)");
    }else {
      cart[count] = product;
      price -= product.price;
      bonuspoint += product.bonuspoint;
      count++;
    }
  }
  void summary() {
    for(int i=0; i<count; i++) {
      System.out.printf("물건이름: %s, 가격: %d \n", cart[i].toString(), cart[i].price);
    }
  }
  
  @Override
  public String toString() {
    String str = "잔액 = " + price + ", 포인트 = " + bonuspoint; 
    return str;
  }
}
