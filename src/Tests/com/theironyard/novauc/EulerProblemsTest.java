package com.theironyard.novauc;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by willc on 2/23/17.
 */
public class EulerProblemsTest extends TestCase{
    EulerProblems eulerProblems = new EulerProblems();
    @Test
    public void testEvenFibs() throws Exception {
        //Initial test to verify correct fib sequence. Will not work after method is changed!
        //assertTrue( eulerProblems.evenFibs() == 231);

        //check for the first n fib numbers. Will not work after method is changed!
        //assertTrue(eulerProblems.evenFibs(10) == 44 );

        //rewrite method to take parameter of max fib value
        assertTrue(eulerProblems.evenFibs(89) == 44);

        //check for base case + 1
        assertTrue(eulerProblems.evenFibs(233) == 188);
        //check for 4,000,000
        assertTrue(eulerProblems.evenFibs(4000000) == 4613732 );
    }

    @Test
    public void testmultiples35() throws Exception {
        assertTrue(eulerProblems.multiples35(10) == 23 );
        assertTrue(eulerProblems.multiples35(11) == 33);
        assertTrue(eulerProblems.multiples35(1000) == 233168);
    }

    @Test
    public void testLargesPrimeFacts() throws Exception{
        //check provided numbers
        assertTrue(eulerProblems.largesPrimeFacts(13195) == 29);
        //check  random number for base case + n
        assertTrue(eulerProblems.largesPrimeFacts(2323122115L) == 881);
        //check final number
        assertTrue(eulerProblems.largesPrimeFacts(600851475143L) == 6857);
    }

    @Test
    public void testPallyNumb(){
        //Check value for one digit numbers
        assertTrue(eulerProblems.pallyNumb(9,9) == 9);
        //Check value for two digit numbers
        assertTrue(eulerProblems.pallyNumb(99,99) == 9009);
        //Check value for three digit numbers
        assertTrue(eulerProblems.pallyNumb(999,999) == 906609);

        //Just for fun, check the pally for four digit numbers!
        assertTrue(eulerProblems.pallyNumb(9999,9999) == 99000099);
    }

}