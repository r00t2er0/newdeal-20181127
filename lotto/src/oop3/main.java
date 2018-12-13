package oop3;

public class main {

  public static void main(String[] args) {
    
    KtTv kttv = new KtTv();
    Audio audio = new Audio();
    NoteBook notebook = new NoteBook();
    
    Buyer buyer = new Buyer();
        
    buyer.buy(kttv);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    buyer.buy(audio);
    
    buyer.summary();

    System.out.println(buyer.toString());
  }

}
