package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class felineGetKittensWithoutParametersTest {

        @Test
        public void felineGetKittensTest() {
            Feline feline = new Feline();
            int actualKittensCount = feline.getKittens();
            assertEquals(1, actualKittensCount) ;
        }
}

