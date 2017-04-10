package com.AE;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Angel on 4/10/17.
 */
public class UtilitiesTest {



    @org.junit.Test
    public void everyNthChar() throws Exception {
        Utilities utils = new Utilities();
        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(new char[] {'e','l'}, output );
        char[] output2 = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception {
       Utilities util = new Utilities();
       assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
       assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
       assertNull("Did not get null returned when arguement passed was null", util.removePairs(null));
       assertEquals("A", util.removePairs("A"));
       assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() throws Exception {
        Utilities util2 = new Utilities();
        assertEquals(300, util2.converter(10,5));

    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        Utilities util1 = new Utilities();
        assertNull(util1.nullIfOddLength("odd"));
        assertNotNull(util1.nullIfOddLength("even"));

    }

}