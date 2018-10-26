package calculatorJUnit5Test;

import calculatorJUnit5.Addition;
import org.junit.jupiter.api.*;

public class CalculatorJUnit5Test {

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each tests");
    }

    @BeforeAll
    void beforeAll() {
        System.out.println("Before all tests");
    }

    @Test
    @DisplayName("Проверка операции сложения")
    void testMethod() {
        Addition addition = new Addition(3, 4);
        Assertions.assertEquals(3 + 4, addition.calculateResult());
    }

    @AfterEach
    void AfterEach() {
        System.out.println("After each tests");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After all tests");
    }
}
