package w03;

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {1,2,4,7,2,5,3,1};
        quickSortRecursive(numbers,0,numbers.length);
    }

    // 퀵 정렬 재귀수함수
    public static void quickSortRecursive(int[] numbers, int left, int right){
        if(left >= right){
            return;
        }

        int pivotPost = partition(numbers,left,right);

        quickSortRecursive(numbers,left,pivotPost-1);
        quickSortRecursive(numbers,pivotPost+1,right);
    }

    public static int partition(int[] numbers, int left, int right) {
        int pivot = numbers[right];

        int i = (left -1);

        for(int j = left; j < right; ++j){
            if(numbers[j] < pivot){
                ++i;
                swap(numbers,i,j);
            }
        }
        int pivotPos = i + 1;
        swap(numbers, pivotPos, right);

        return pivotPos;
    }

    public static void swap(int[] nums, int pivotPos, int right) {
        int temp = nums[pivotPos];
        nums[pivotPos] = nums[right];
        nums[right] = temp;
    }
}
