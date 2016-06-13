package javajeongseok.chapter06.instance;

/**
 * @ClassName   : TvTest
 * @Description : instance 생성과 사용2
 * @Author      : 조원태
 * @Date        : 2016. 5. 7.
 */
public class TvTest2 {
    public static void main(String[] args) {
        Tv t1;          // Tv 인스턴스를 참조하기 위한 변수 t1를 선언
        Tv t2;          // Tv 인스턴스를 참조하기 위한 변수 t2를 선언
        t1 = new Tv();  // Tv 인스턴스를 생성한 후 생성된 Tv 인스턴스의 주소를 t1에 저장
        t2 = new Tv();  // Tv 인스턴스를 생성한 후 생성된 Tv 인스턴스의 주소를 t2에 저장
        
        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
        
        t1.channel = 7; // channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        
        System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
    }
}