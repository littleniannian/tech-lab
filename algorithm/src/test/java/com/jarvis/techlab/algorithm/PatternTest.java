package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.pattern.struct.adapter.Duck;
import com.jarvis.techlab.algorithm.pattern.struct.adapter.Turkey;
import com.jarvis.techlab.algorithm.pattern.struct.adapter.TurkeyAdapter;
import com.jarvis.techlab.algorithm.pattern.struct.adapter.WildTurkey;
import org.junit.jupiter.api.Test;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName PatternTest.java
 * @createTime 2022年02月24日 15:24:00
 */
public class PatternTest {
    @Test
    public void adapterTest(){
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
