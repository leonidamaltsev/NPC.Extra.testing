import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RabbitTest {

    @Test
    public void testMaxCarrots15() {
        Rabbit rabbit = new Rabbit();

        int[] fields = {1, 2, 3, 4, 5};
        int maxLoad = 5;
        int trip = 10;
        int result = rabbit.maxCarrots(fields, maxLoad, trip);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testMaxCarrots31() {
        Rabbit rabbit = new Rabbit();

        int[] fields = {2, 3, 5, 8, 13};
        int maxLoad = 5;
        int trip = 10;
        int result = rabbit.maxCarrots(fields, maxLoad, trip);
        Assertions.assertEquals(31, result);
    }
}