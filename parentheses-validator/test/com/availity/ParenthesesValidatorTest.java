package com.availity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParenthesesValidatorTest {

    @Test
    void isValid() {
        // Valid LISP code
        String lispCode = "USER(11): (trace factorial)" +
                "(FACTORIAL)" +
                "USER(12): (factorial 4)" +
                " 0: (FACTORIAL 4)" +
                "   1: (FACTORIAL 3)" +
                "     2: (FACTORIAL 2)" +
                "       3: (FACTORIAL 1)" +
                "       3: returned 1" +
                "     2: returned 2" +
                "   1: returned 6" +
                " 0: returned 24" +
                "24";
        Assertions.assertTrue(ParenthesesValidator.isValid(lispCode));

        // Invalid LISP code - Double Open Parenthesis
        lispCode = "USER(11): ((trace factorial)";
        Assertions.assertFalse(ParenthesesValidator.isValid(lispCode));

        // Invalid LISP code - Double Close Parenthesis
        lispCode = "USER(11): (trace) factorial)";
        Assertions.assertFalse(ParenthesesValidator.isValid(lispCode));
    }
}