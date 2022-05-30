public class SpatialComplexity {
    public static void main(String[] args) {
        int result = recursiveSum(6);
        int result1 = pairSumSequence(6);
        System.out.println(result);
        System.out.println(result1);
    }

    /*
    * 재귀호출에서 사용하는 스택공간 또한 공간 복잡도 계산에 포함
    * 시간복잡도 O(N)
    * 공간복잡도 O(N)
    * */
    static int recursiveSum(int n){
      if(n<=0){
          return 0;
      }
      return n + recursiveSum(n-1);
    }


    /*
    * 0과 N 사이에서 인접한 두 원소의 합
    * pairSum 함수를 대략 O(N)번 호출했지만
    * 이 함수들이 호출스택에 동시에 존재하지 않으므로 O(1) 공간만 사용
    * */
    static int pairSumSequence(int n){
        int sum = 0;
        for (int i = 0; i<n; i++){
            sum += pairSum(i,i+1);
        }
        return sum;
    }

    static int pairSum(int a, int b){
        return a + b;
    }

}