package quiz11;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        FibonacciSequence sequence = new FibonacciSequence();
        
        sequence.calc(number);
        
        sc.close();

  }

}
