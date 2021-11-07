package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;


import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class catMakeTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void catMakeTest(){
        Cat cat = new Cat(feline);
    }

}
