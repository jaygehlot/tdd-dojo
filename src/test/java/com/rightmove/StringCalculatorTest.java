package com.rightmove;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {

    //the class under test
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public final void shouldThrowUnsupportedOperationExceptionWhenAddingAString() {
        assertThatThrownBy(()-> stringCalculator.add("hello"))
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessage("This shit is bananas");
    }
}