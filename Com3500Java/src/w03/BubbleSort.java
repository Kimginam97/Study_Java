package w03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,65,34,22,42,11,3,23,7,65,3,5,23,42};

        for(int i=0;i<nums.length-1;i++){
            for(int j=0; j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<nums.length-1;i++){
            System.out.printf("%d ",nums[i]);
        }

    }
}
