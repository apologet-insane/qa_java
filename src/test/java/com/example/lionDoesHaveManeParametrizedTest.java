package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class lionDoesHaveManeParametrizedTest {
    final private String sex;
    final private boolean expectedHasMane;

    public lionDoesHaveManeParametrizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    private Feline feline;
    @Test
    public void lionDoHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test(expected = Exception.class)
    public void lionWhatASexManeTest() throws Exception {

        Lion lion = new Lion("Боевой вертолёт", feline);
        boolean actualHasMane = lion.doesHaveMane();
    }
}