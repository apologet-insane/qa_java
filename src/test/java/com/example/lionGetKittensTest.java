package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class lionGetKittensTest {
@Mock
private Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
Mockito.when (feline.getKittens()).thenReturn(1);
       final int kotyatRoditso = lion.getKittens();
        final int kotyatNado = 1;
        assertEquals (kotyatRoditso, kotyatNado);


    }
}
