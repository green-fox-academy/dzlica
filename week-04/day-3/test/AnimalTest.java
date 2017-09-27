import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal testAnimal = new Animal(50,50);

    @Test
    public void testEat() {
        testAnimal.eat();
        assertEquals(51, testAnimal.hunger);
    }

    @Test
    public void testDrink() {
        testAnimal.dring();
        assertEquals(51, testAnimal.thirst);
    }

    @Test
    public void testPlay() {
        testAnimal.play();
        assertEquals(49, testAnimal.hunger);
        assertEquals(49, testAnimal.thirst);
    }

}