
import java.util.Scanner;
import java.util.Arrays;

public class Q2 {
   private int[] arr = null;
   private boolean[] bool = null;
   
   public Q2() {
   }
   
   private void singleNumber() {
      //이중포문을 통한 반복수 검사
      for (int i = 0; i < arr.length; i++) {
         int cur = arr[i];
         int boolcount = 0;
         for (int j = 0; j < arr.length; j++) {
            //만약 i번째 수가 j번째와 같다면 
            if (cur == arr[j]) {
               boolcount++; //카운트 증가
               if(boolcount >= 2) { //자기자신을 제외하고도 한번 더 카운트가 된다면
                  bool[i] = true; // bool을 참으로 변경
                  boolcount = 0; // *****카운트 초기화******
                  break; // 빠져나가기
               }
            }
            
         }
      }
   }
   
   private void printResult() {
      System.out.println("결과 : ");
      for(int i=0; i<bool.length; i++) 
         if(!bool[i])
            System.out.print(arr[i] + "\t");
   }
   
   private void makeAndRead() {
      Scanner scn = new Scanner(System.in);
      System.out.println("배열의 크기를 입력하시오 : ");
      int size = scn.nextInt();
      arr = new int[size];
      bool = new boolean[size];
      //불린 배열 초기화
      for (int i = 0; i < bool.length; i++) {
         bool[i] = false;
      }
      
      // 배열 입력
      System.out.println("배열의 입력값을 띄어쓰기를 활용하여 입력하시오 : ");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = scn.nextInt();
      }
   }
   
   private void calc() {
      makeAndRead();
      singleNumber(); // a[]를 참고하여 b[] 결정
      printResult();
   }

   public static void main(String[] args) {
      Q2 jv = new Q2();
      jv.calc();
   }

}