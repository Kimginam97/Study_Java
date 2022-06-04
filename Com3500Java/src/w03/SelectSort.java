package w03;

public class SelectSort {
    public static void main(String[] args) {
        // 선택정렬 알고리즘(Selection Sort Algorithm)
        // 무작위 데이터를 오름차순/내림차순 정렬
        int[] arr = {5, 3, 1, 2, 4};

        for(int i = 0; i<arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
                if(arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
                    int temp = arr[i]; // 값 변경해야 하기에 임시 저장
                    arr[i] = arr[j]; // j를 i로 변경
                    arr[j] = temp;  // i를 j로 변경
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " "); // 정렬 후 결과 출력
        }
    }
}
