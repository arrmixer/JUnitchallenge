package com.AE;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Angel on 4/10/17.
 */
public class UtilitiesTest {

    private Utilities utils;

    @org.junit.Before
    public void setup(){
        utils = new Utilities();
    }


    @org.junit.Test
    public void everyNthChar() throws Exception {

        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(new char[] {'e','l'}, output );
        char[] output2 = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception {

       assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
       assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
       assertNull("Did not get null returned when arguement passed was null", utils.removePairs(null));
       assertEquals("A", utils.removePairs("A"));
       assertEquals("", utils.removePairs(""));
    }

    @org.junit.Test
    public void converter() throws Exception {

        assertEquals(300, utils.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithemeticExeception() throws Exception {

        utils.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {

        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("even"));

    }

}