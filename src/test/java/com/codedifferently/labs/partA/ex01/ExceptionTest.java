package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Exception;

public class ExceptionTest {

        @Test
        public void ExceptionTest01(){
            String expected = "Sum:12";
            int[] nums = {3, 2, 6, 1};
            String actual = Exception.badUse(nums);
            Assertions.assertEquals(expected, actual);
        }
    }

