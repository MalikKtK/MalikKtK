package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void getPriceFromAge() {
        //Arrange
        PriceCalculator calc = new PriceCalculator();
        int expectedInvalidInput = -1;
        int expectedPensionTicket = 10;

        //Act
        int invalidResult = calc.getPriceFromAge(-139846);
        int pensionResult = calc.getPriceFromAge(75);

        //Assert
        assertEquals(expectedInvalidInput,invalidResult);
        assertEquals(expectedPensionTicket,pensionResult);
    }
}