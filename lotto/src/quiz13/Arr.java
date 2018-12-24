package quiz13;

public class Arr {
  void select(int[] arr) {
      
      for(int i=0; i<arr.length-1; i++) {
          int min = arr[i];
          int index = 0;
          
          System.out.println("현재 PASS");
          for(int j=i+1; j<arr.length; j++) {
              System.out.printf("%d와 %d 비교\n",min, arr[j]);
              if(min > arr[j]) {
                  index = j;
                  min = arr[j];
              }
          }
          
          int temp = arr[i];
          arr [i] = arr[index];
          arr[index] = temp;
      }
      
      for(int i=0; i<arr.length; i++) {
          System.out.printf("%d ",arr[i]);
      }
  }
  
  void bubble(int[] arr) {
      
      for(int i=0; i<arr.length-1; i++) {
          
          System.out.println("현재 PASS");
          for(int j=1; j<arr.length-i; j++) {
              
              System.out.printf("%d와 %d 비교\n", arr[j-1], arr[j]);
              if(arr[j-1] > arr[j]) {
                  int temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;
              }
          }
      }
      
      for(int i=0; i<arr.length; i++) {
          System.out.printf("%d ",arr[i]);
      }
  }
}