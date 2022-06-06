package w03;

public class InsertSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 2, 4};

        for(int i = 1; i < arr.length; i++) {
            int standard = arr[i]; // 기준			i
            int aux = i - 1;    // 비교할 대상

            while(aux >= 0 && standard < arr[aux]){
                arr[aux + 1] = arr[aux];
                aux --;
            }
            arr[aux+1] = standard; // 기준값 저장
        }

        for (int j : arr) {
            System.out.print(j + " "); // 정렬 후 결과 출력
        }
    }
}
