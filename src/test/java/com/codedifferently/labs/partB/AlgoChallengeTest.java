package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 28
    @Test
    public void deleteDelTest01() {

        // Given
        String str = "adelbc";

        // When
        String expected = "abc";
        String actual = AlgoChallenge.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest02() {

        // Given
        String str = "adelHello";

        // When
        String expected = "aHello";
        String actual = AlgoChallenge.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest03() {

        // Given
        String str = "adedbc";

        // When
        String expected = "adedbc";
        String actual = AlgoChallenge.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }



    // Problem 29
    @Test
    public void maxNumberTest01() {

        // Given
        int a = 1;
        int b = 2;
        int c = 3;

        // When
        Integer expected = 3;
        Integer actual = AlgoChallenge.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest02() {

        // Given
        int a = 1;
        int b = 3;
        int c = 2;

        // When
        Integer expected = 3;
        Integer actual = AlgoChallenge.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest03() {

        // Given
        int a = 3;
        int b = 2;
        int c = 1;

        // When
        Integer expected = 3;
        Integer actual = AlgoChallenge.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
