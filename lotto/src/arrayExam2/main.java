package arrayExam2;

public class main {

  public static void main(String[] args) {
    int sum=0;
    float average = 0f;
    int[] jumsu = {100,55,90,60,78};
    
    //1. 총 과목수
    System.out.printf("총과목수 : %d \n", jumsu.length);
    
    //2. 점수의 합
    //3. 점수의 평균을 구하세요 (2,3은 하나의 for문에서)
    for(int i=0; i<jumsu.length; i++) {
      sum += jumsu[i];
      /*average += jumsu[i]/jumsu.length;*/
      
    }
    System.out.printf("점수의 합 : %d \n", sum);
    System.out.printf("점수의 평균 : %f", average);
    
  }

}
