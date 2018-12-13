package oop2;

public class main {

  public static void main(String[] args) {
    
    KtTv kttv = new KtTv();
    Audio audio = new Audio();
    NoteBook notebook = new NoteBook();
    
    /*
    Product kttv = new KtTv();
    Product audio = new Audio();
    Product notebook = new NoteBook();
    */
    Buyer buyer = new Buyer();
        
    buyer.buy(kttv);
    buyer.buy(audio);

    System.out.println(buyer.toString());
  }

}
