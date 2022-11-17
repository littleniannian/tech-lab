package com.jarvis.techlab.algorithm.basic.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryOperatorTest {

    @Test
    public void isOddTest(){
        Assertions.assertTrue(BinaryOperator.isOdd(9),"error");
    }

}
