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
       // assertTrue(eulerProblems.pallyNumb(999,999) == 906609);

        //Just for fun, check the pally for four digit numbers! Remove the comments to run!
        //assertTrue(eulerProblems.pallyNumb(9999,9999) == 99000099);
    }

    @Test
    public void testFibIndex(){
        //Check value for provided base case
        //assertTrue(eulerProblems.fibIndex(100) == 12);
        //Check value for base case + 1
        //assertTrue(eulerProblems.fibIndex(145) == 13);
        //Check value for expected result:

        //Check Value for result of 10^2
        assertTrue(eulerProblems.fibIndex(1) == 12);
        //Check value for result of 10^3
        assertTrue(eulerProblems.fibIndex(2) == 17);
        //Value of 10^100 digits. The index is off by 2 as noted above
        assertTrue(eulerProblems.fibIndex(998) == 4782);
    }

    @Test
    public void testSmallestMulti(){
        //This problem was strangely listed as unsolved, but after answering it shows it is solved
        //The difficulty of the problem, or lack of, should have clued me in!

        //Check for answer
        assertTrue(eulerProblems.smallestMulti() == 232792560);
    }

    @Test
    public void testFibPanChecker(){

        //This test takes a really...really...really.... long time. be warned!
        //The formula is right but I need a better way of getting the front 9 digits out of the
        //fib number when checking.

        //DON'T RUN UNLESS YOU ARE BRAVE!
        //System.out.println(eulerProblems.fibPanChecker());
    }
}