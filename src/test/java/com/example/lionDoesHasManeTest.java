package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class lionDoesHasManeTest {


    @Mock
    Feline feline;
    @Test
            public void lionHasManeTest() throws Exception{


       // this.exepctedHasMane = exepctedHasMane;
Lion lion = new Lion ("Самец", feline);
boolean actualHasMane = lion.doesHaveMane();
assertEquals(true, actualHasMane);

        }

        @Test
        public void lionessHasNotManeTest() throws Exception{


            // this.exepctedHasMane = exepctedHasMane;
            Lion lion = new Lion ("Самка", feline);
            boolean actualHasMane = lion.doesHaveMane();
            assertEquals(false, actualHasMane);

        }

        @Test (expected = Exception.class)
    public void lionWhatASexManeTest() throws Exception{

        Lion lion = new Lion ("Боевой вертолёт", feline);
            boolean actualHasMane = lion.doesHaveMane();
    }
}

