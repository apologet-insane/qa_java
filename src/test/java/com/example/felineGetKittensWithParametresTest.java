package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class felineGetKittensWithParametresTest {

    final private int kittensCount;
    final private int expectedKittensCount;

    public felineGetKittensWithParametresTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {26, 26}
        };
    }

    @Test
    public void felineGetKittensTest() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(kittensCount);
        assertEquals(expectedKittensCount, actualKittensCount) ;
    }
}
