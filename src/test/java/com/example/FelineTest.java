package com.example;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of ("Животные", "Птицы", "Рыба");
        assertEquals (expectedFood, actualFood);
    }

    @Test
    public void felineGetKittensTest() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        assertEquals(1, actualKittensCount) ;
    }

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(actualFamily, expectedFamily);
    }
}