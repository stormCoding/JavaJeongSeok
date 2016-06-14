package javajeongseok.chapter06.classs;

/**
 * @ClassName   : Time
 * @Description : 클래스의 또 다른 정의
 * @Author      : 조원태
 * @Date        : 2016. 6. 14.
 */
public class Time {
    private int hour;   // 시
    private int minute; // 분
    private int second; // 초
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int h) {
        if(h < 0 || h > 23) {
            return;
        }
        hour = h;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public void setMinute(int m) {
        if(m < 0 || m > 59) {
            return;
        }
        minute = m;
    }
    
    public void setSecond(int s) {
        if(s < 0 || s > 59) {
            return;
        }
        second = s;
    }
}
