package com.example;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class felineEatMeatTest {

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();

        List<String> kushaet = feline.eatMeat();
        List<String> nadoKushat = List.of ("Животные", "Птицы", "Рыба");
        assertEquals (kushaet, nadoKushat);


    }
}