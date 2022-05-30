public class IgnoreConstantTerm {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        /*
        * for 루프 한개 사용, 루프안에 코드가 두줄
        * */

//        for(int x : array){
//            if(x < min) min = x;
//            if(x > max) max = x;
//        }


        /*
        * for 루프 두개 사용, 루프안에 코드가 한줄
        * */

//        for(int x : array){
//            if(x < min) min = x;
//        }
//        for(int x : array){
//            if(x > max) max = x;
//        }

        /*
        * 어셈블리 단계에서 곱셈이 덧셈보다 더 많은명령어를 사용
        * 컴파일러가 나름 최적화를 한다
        * */

    }
}
