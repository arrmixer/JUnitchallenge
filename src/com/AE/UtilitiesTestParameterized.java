package com.AE;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angel on 4/10/17.
 */
@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities utils;
    private String expected;
    private String source;

    public UtilitiesTestParameterized(String expected, String source) {
        this.expected = expected;
        this.source = source;
    }

    @org.junit.Before
    public void setup(){
        utils = new Utilities();

    }



    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEF","ABCDEFF"},
                {"AB8EFG","AB88EFFG"},
                {"123456","112233445566"},
                {"ZYZQB","ZYZQQB"},
                {"A","A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(expected, utils.removePairs(source));

    }


}
