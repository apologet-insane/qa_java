package com.example;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class lionGetFoodTest {
   @Mock
   Feline feline = new Feline();

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
       //если, например, в Lion изменится animalKind на "Травоядное", то тест отловит изменения
        Mockito.when (feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> kushaet = lion.getFood();
        List<String> nadoKushat = List.of ("Животные", "Птицы", "Рыба");

        assertEquals (kushaet, nadoKushat);


}
}

