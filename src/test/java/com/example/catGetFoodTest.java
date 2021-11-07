package com.example;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class catGetFoodTest {

    @Mock
   Feline feline;
   Predator predator;
@Test
    public void catGetFoodTest () throws  Exception {
    Cat cat = new Cat(feline);
    Mockito.when (feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> kushaet = cat.getFood();
    List<String> nadoKushat = List.of ("Животные", "Птицы", "Рыба");
    assertEquals (kushaet, nadoKushat);
}

}
