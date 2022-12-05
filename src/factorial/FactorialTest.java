package factorial;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FactorialTest {

    Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    @DisplayName("Find the factorial of 0 that must be 0")
    @Order(1)
    void findFactorialWhenTheGivenNumberIs0() {
        // GIVEN
        int num = 0;
        // WHEN
        int factorial = Factorial.findFactorial(num);
        // THEN
        assertNotNull(factorial);
        assertEquals(1, factorial);

    }

    @Test
    @DisplayName("Find the factorial of 1 that must return 1")
    @Order(2)
    void findFactorialWhenTheGivenNumberIs1(){
        // GIVEN
        int num = 1;
        // WHEN
        int fact = Factorial.findFactorial(num);
        // THEN
        assertNotNull(fact);
        assertEquals(1, fact);
        assertNotEquals(2, fact);

    }

    @Test
    @DisplayName("Find the factorial of any number")
    @Order(3)
    void findFactorialOfAnyNumber(){
        // GIVEN
        int num = 5;

        // WHEN
        int fact = Factorial.findFactorial(num);

        // THEN
        assertNotNull(fact);
        assertEquals(120, fact);
        assertNotEquals(720, fact);
    }

    @Test
    @DisplayName("Find the factorial of any number")
    @Order(4)
    void findFactorialOfNegativeNumber(){
        // GIVEN
        int num = -5;

        // WHEN
        int fact = Factorial.findFactorial(num);

        // THEN
        assertNotNull(fact);
        assertEquals(1, fact);
        assertNotEquals(120, fact);

    }


}