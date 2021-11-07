package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class felineGetFamilyTest {


    @Test
    public void felineGetFamilyTest() {

        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(actualFamily, expectedFamily);
    }
}
