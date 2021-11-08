package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        //стаб для метода из класса Feline. Если в Feline ошибка, то тест на Lion всё равно будет работать
        //если же в lion.getKittens будет ошибка и актуальное количество котят будет отличаться от ожидаемого
        //то тест покажет ошибку именно в Lion
        Mockito.when (feline.getKittens()).thenReturn(1);
        final int actualLionKittensCount = lion.getKittens();
        final int expectedLionKittensCount = 1;
        assertEquals (expectedLionKittensCount, actualLionKittensCount);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        //стаб разрывает зависимость с классом Feline. Если ошибка будет в Feline, тест не упадёт, а если в Lion — упадёт.
        Mockito.when (feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> kushaet = lion.getFood();
        List<String> nadoKushat = List.of ("Животные", "Птицы", "Рыба");
        assertEquals (kushaet, nadoKushat);
    }

    @Test
    public void lionHasManeTest() throws Exception{
        Lion lion = new Lion ("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(true, actualHasMane);
    }

    @Test
    public void lionessHasNotManeTest() throws Exception{
        Lion lion = new Lion ("Самка", feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(false, actualHasMane);
    }

    @Test (expected = Exception.class)
        public void lionManeExceptionTest() throws Exception{
        Lion lion = new Lion ("Боевой вертолёт", feline);
        boolean actualHasMane = lion.doesHaveMane();
    }
}
