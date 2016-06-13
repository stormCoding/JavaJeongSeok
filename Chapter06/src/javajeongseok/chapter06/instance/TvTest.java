package javajeongseok.chapter06.instance;

/**
 * @ClassName   : TvTest
 * @Description : instance 생성과 사용
 * @Author      : 조원태
 * @Date        : 2016. 5. 7.
 */
class TvTest {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // Tv 인스턴스를 생성한 후 생성된 Tv인스턴스의 주소를 t에 저장
        t.channel = 7;      // Tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();    // Tv 인스턴스의 메서드 channelDown()을 호출한다.
        
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}

