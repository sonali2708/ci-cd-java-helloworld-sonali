package com.workflow.github;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckSanityTest {

    @Test
    public void should_return_true_when_initialize_env() {
       assertEquals(true, Boolean.valueOf("true"));
    }

    @Test
    public void should_concatenate_two_strings() {
        String actual = "hello ".concat("world");
        String expected = "hello world";
        assertEquals(actual,expected);
    }


}
