package javajeongseok.chapter06.instance;

/**
 * @ClassName   : Tv
 * @Description : 속성과 기능
 * @Author      : 조원태
 * @Date        : 2016. 5. 7.
 */
class Tv {
    // Tv의 속성(멤버변수)
    String color;   // 색
    boolean power;  // 전원상태(on/off)
    int channel;    // 채
    
    // Tv의 기능(메서드) - Tv를 켜거나 끄는 기능을 하는 메서드
    void power() {
        power = !power;
    }
    
    // Tv의 기능(메서드) - Tv의 채널을 높이는 기능을 하는 메서드
    void channelUp() {
        ++channel;
    }
    
    // Tv의 기능(메서드) - Tv의 채널을 낮추는 기능을 하는 메서드
    void channelDown() {
        --channel; 
    }
}   
