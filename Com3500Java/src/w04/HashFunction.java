package w04;

public class HashFunction {

    /*
    * LoseLose 해시 함수
    * 프로그래밍 책에서 간단히 소개하려고 만든코드
    * 대부분의 해시함수는 부호없는 정수형 사용
    * java 만 부호없는 정수형이 없다
    * java 구현할시 쓸데없는짓을 함
    * 매우간단하지만 충돌이 많음
    *
    * byte -> 아스키코드 -> 0~255
    * */

//    public uint LoseLose(byte[] str){
//        uint hash = 0;
//        foreach (byte c in str){
//            hash += c;
//        }
//        return hash;
//    }


    /*
    * FNV-1 해시
    * */

//    #define FNV_PRIME_32 16777619
//    #define FNV_OFFSET_32 2166136261U
//    uint32_t FNV32(const char *str, uint32_t len){
//        uint32_t hash = FNV_OFFSET_32;
//        uint32_t i;
//        for(i=0;i<len;++i){
//            hash = hash * FNV_PRIME_32;
//            hash = hash ^ str[i];
//        }
//        return hash;
//    }


    /*
     * FNV-1a 해시
     * */
//    #define FNV_PRIME_32 16777619
//    #define FNV_OFFSET_32 2166136261U
//    uint32_t FNV32(const char *str, uint32_t len){
//        uint32_t hash = FNV_OFFSET_32;
//        uint32_t i;
//        for(i=0;i<len;++i){
//            hash = hash ^ str[i];
//            hash = hash * FNV_PRIME_32;
//        }
//        return hash;
//    }


}
