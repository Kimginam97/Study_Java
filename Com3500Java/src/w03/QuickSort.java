package w03;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {1,2,4,7,2,5,3,1};
        //quickSortRecursive(nums,0,nums.length);
    }

    // 퀵 정렬 재귀수함수
    /*public static void quickSortRecursive(int[] nums, int left, int right){
        if(left >= right){
            return;
        }

        int pivotPost = partition(nums,left,right);

        quickSortRecursive(nums,left,pivotPost-1);
        quickSortRecursive(nums,pivotPost+1,right);
    }*/
}
