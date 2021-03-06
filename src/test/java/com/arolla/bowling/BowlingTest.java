package com.arolla.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingTest {

    @Test
    void should_return_zero_when_never_score() {
        // Given
        Bowling bowling = new Bowling();

        // When
        for(int i =0; i< 20; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(0, bowling.getScore());
    }

    @Test
    void should_return_number_of_pins_when_some_have_fallen() {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(0, 5);
        for(int i =1; i< 20; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(5, bowling.getScore());
    }

    @Test
    void should_return_score_22_when_strike_5_and_2_pins() {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(0, 10);
        bowling.score(1, 5);
        bowling.score(2, 0);
        bowling.score(3, 2);
        bowling.score(4, 0);
        for(int i =5; i< 20; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(22, bowling.getScore());
    }

    @Test
    void should_return_score_38_when_strike_and_spare_3_and_2_pins()
    {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(0, 10);
        bowling.score(1, 5);
        bowling.score(2, 5);
        bowling.score(3, 3);
        bowling.score(4, 2);
        for(int i =5; i< 20; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(38, bowling.getScore());
    }

    @Test
    void should_return_score_20_when_strike_and_spare_separated_by_null_frame()
    {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(0, 0);
        bowling.score(1, 0);
        bowling.score(2, 10);
        bowling.score(3, 0);
        bowling.score(4, 0);
        bowling.score(5, 5);
        bowling.score(6, 5);
        for(int i =7; i< 20; i++) {
            bowling.score(i, 0);
        }

        // Then
        assertEquals(20, bowling.getScore());
    }

    @Test
    void should_return_score_139_complex_case()
    {
        // Given
        Bowling bowling = new Bowling();

        // When
        bowling.score(0, 1);
        bowling.score(1, 2);
        bowling.score(2, 3);
        bowling.score(3, 4);
        bowling.score(4, 5);
        bowling.score(5, 5);
        bowling.score(6, 6);
        bowling.score(7, 3);
        bowling.score(8, 2);
        bowling.score(9, 1);
        bowling.score(10, 10);
        bowling.score(11, 8);
        bowling.score(12, 2);
        bowling.score(13, 4);
        bowling.score(14, 3);
        bowling.score(15, 10);
        bowling.score(16, 10);
        bowling.score(17, 10);
        bowling.score(18, 10);

        // Then
        assertEquals(139, bowling.getScore());
    }

    @Test
    void should_return_score_83_complex_case()
    {
        // Given
        Bowling bowling = new Bowling();

        // When
        for(int i =0; i< 16; i++) {
            bowling.score(i, 3);
        }
        bowling.score(16, 5);
        bowling.score(17, 5);
        bowling.score(18, 5);
        bowling.score(19, 5);
        bowling.score(20, 10);

        // Then
        assertEquals(83, bowling.getScore());
    }
}