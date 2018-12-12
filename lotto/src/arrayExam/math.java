package arrayExam;

public class math {
  public static void max(int[] score, int max) {
    for(int i=1; i<score.length;i++) {
      if(score[i] > max) {
        max = score[i];
      }
    }
    System.out.printf("최대값 : %d ",max);
  }
  
  public static void min(int[] score, int min) {
    for(int i=1; i<score.length;i++) {
      if(score[i] < min) {
        min = score[i];
      }
    }
    System.out.printf("최소값: %d" , min);
  }
}
