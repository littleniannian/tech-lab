package com.jarvis.techlab.newfeature.switchcase;

import com.jarvis.techlab.newfeature.switchcase.enums.DayEnum;
import org.springframework.util.Assert;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月11日 23:17:00
 */
public class SwitchTestClass {

    public static int getDayOfWeek(DayEnum day){
        return switch(day){
            case MONDAY,FRIDAY,SUNDAY->6;
            case TUESDAY -> 7;
            case THURSDAY,SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        int res = SwitchTestClass.getDayOfWeek(DayEnum.MONDAY);
        Assert.isTrue(res == 6,"error");
    }
}
