public class BigOExample {

    public static void main(String[] args) {

    }

    /*
    * Ex 01
    * 시간복잡도: O(N)
    * 배열을 두번 읽든 한번 읽든 big-O 시간을 구할때는 영향을 안다다
    * */
    private static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
}
