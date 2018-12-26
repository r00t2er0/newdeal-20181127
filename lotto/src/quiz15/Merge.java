package quiz15;

import java.util.Arrays;

public class Merge {

  public static void main(String[] args) {

    int A[] = {1,3,5,7,9,11,13,15,17,19};
    int B[] = {2,4,6,8,10,12,14,16,18,20};
    int Merge[] = new int[20];
    int J,K,L;
    
    J=0; K=0; L=0;
    
    Arrays.sort(A);
    Arrays.sort(B);
    
    while(L != Merge.length) {
      System.out.printf("J : %d, K : %d, L : %d\n",J,K,L);
      if(J < 10 && K <10) {
        if(A[J] >= B[K]) {
          Merge[L] = B[K];
          K++;
          L++;
        }else if(A[J] < B[K]) {
          Merge[L] = A[J];
          J++;
          L++;
        }
      }else if(J == 10 && K < 10){
        Merge[L] = B[K];
        L++;
      }else if(K == 10 && J < 10){
        Merge[L] = A[J];
        L++;
      }
    }
    
    System.out.println();
    for(int i=0; i<Merge.length; i++) {
      System.out.printf("%d ",Merge[i]);
    }
  }

}
