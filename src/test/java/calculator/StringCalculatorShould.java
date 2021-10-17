package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void hadle_multiple_input_string(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("1,2,3"));
    }

    @Test
    void handeNewLines(){
        assertEquals(6,stringCalculator.add("1\n2,3"));
    }

    @Test()
    void negetiveNotAllowed(){
        try {

            stringCalculator.add("-1,3");
            fail("excetion not thrown");
        }catch (Exception exeption){
            assertTrue(exeption instanceof NegetivesNotAllowedException);
        }
    }








}
