package tech.zerofiltre.common;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void testMe_shouldBe_True() {
        App app = new App();

        assertTrue(app.testMe("theGoodValue"));
    
    }
}
