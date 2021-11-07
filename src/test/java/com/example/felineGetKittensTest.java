package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class felineGetKittensTest {
    final private int a;
    final private int expectedKittensCount;

    public felineGetKittensTest(int a, int expectedKittensCount) {
        this.a = a;
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
        int actualKittensCount = feline.getKittens(a);
        assertEquals(expectedKittensCount, actualKittensCount) ;
    }


}
