package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class catTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void catMakeNotNullTest() {
        Cat cat = new Cat(feline);
        assertNotNull(cat);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = cat.getFood();
        List<String> actualFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actualFood, expectedFood);
    }

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound, actualSound);

    }
}
