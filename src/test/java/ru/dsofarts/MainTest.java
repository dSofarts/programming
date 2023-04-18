package ru.dsofarts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void createPhoneNumberOne() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "(012) 345-6789";
        assertEquals(Main.createPhoneNumber(array), expected);
    }

    @Test
    void createPhoneNumberTwo() {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        String expected = "(987) 654-3210";
        assertEquals(Main.createPhoneNumber(array), expected);
    }

    @Test
    void createPhoneNumberThree() {
        int[] array = new int[]{8, 0, 0, 5, 5, 5, 5, 5, 5, 5};
        String expected = "(800) 555-5555";
        assertEquals(Main.createPhoneNumber(array), expected);
    }

    @Test
    void countBitsOne() {
        assertEquals(Main.countBits(1234), 5);
    }

    @Test
    void countBitsTwo() {
        assertEquals(Main.countBits(0), 0);
    }

    @Test
    void countBitsThree() {
        assertEquals(Main.countBits(00), 0);
    }

    @Test
    void countBitsFour() {
        assertEquals(Main.countBits(0123), 4);
    }

    @Test
    void countBitsFive() {
        assertEquals(Main.countBits(10000000), 8);
    }

    @Test
    void countBitsSix() {
        assertEquals(Main.countBits(2000000000), 13);
    }

    @Test
    void countBitsSeven() {
        assertEquals(Main.countBits(2147483647), 31);
    }

    @Test
    void countBitsEight() {
        assertEquals(Main.countBits(2137453601), 18);
    }
}