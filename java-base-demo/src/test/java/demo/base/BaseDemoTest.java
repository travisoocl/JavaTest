package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());

        int sum1 = 5;

        int sum2 = 11;

        assertEquals(sum1, baseDemo.sum(2,3));
        assertEquals(sum2, baseDemo.sum(6,5));

    }
}
