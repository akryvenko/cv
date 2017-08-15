package com.cv.document;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by alexander.kryvenko on 14.08.2017.
 */
public class DocumentServiceTest {

    private DocumentService calc;

    @BeforeMethod
    public void setUp() throws Exception {
        calc = new DocumentService();
    }

    @Test
    public void test_1() throws Exception {
        calc.add(1);
        calc.add(-1);
        calc.add(2);
        calc.add(-3);
        calc.add(-2);
        int result = calc.getCount();

        assertEquals(result, 2);
    }

    @Test
    public void test_2() throws Exception {
        calc.add(1);
        calc.add(-1);
        calc.add(2);
        calc.add(3);
        calc.add(-3);
        calc.add(-2);
        int result = calc.getCount();

        assertEquals(result, 4);
    }

    @Test
    public void test_3() throws Exception {
        calc.add(1);
        calc.add(2);
        calc.add(3);
        calc.add(4);
        calc.add(5);
        calc.add(-5);
        calc.add(-4);
        calc.add(-3);
        calc.add(-2);
        calc.add(-1);
        int result = calc.getCount();

        assertEquals(result, 10);
    }

    @Test
    public void test_4() throws Exception {
        calc.add(1);
        calc.add(2);
        calc.add(3);
        calc.add(4);
        calc.add(2);
        calc.add(3);
        calc.add(1);
        calc.add(3);
        calc.add(-2);
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 0);
    }

    @Test
    public void test_5() throws Exception {
        calc.add(1);
        calc.add(-2);
        calc.add(-3);
        calc.add(-4);
        calc.add(-2);
        calc.add(-3);
        calc.add(-3);
        calc.add(-2);
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 0);
    }

    @Test
    public void test_6() throws Exception {
        DocumentService calc = new DocumentService();
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 0);
    }

    @Test
    public void test_7() throws Exception {
        calc.add(1);

        int result = calc.getCount();

        assertEquals(result, 0);
    }

    @Test
    public void test_8() throws Exception {
        calc.add(1);
        calc.add(1);
        calc.add(2);
        calc.add(2);
        calc.add(-2);
        calc.add(-2);
        calc.add(-1);
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 8);
    }

    @Test
    public void test_9() throws Exception {
        calc.add(1);
        calc.add(-1);
        calc.add(2);
        calc.add(3);
        calc.add(4);
        calc.add(-4);
        calc.add(5);
        calc.add(6);
        calc.add(7);
        calc.add(-7);
        calc.add(-6);
        calc.add(-5);
        calc.add(-3);
        calc.add(-2);
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 12);
    }

    @Test
    public void test_10() throws Exception {

        calc.add(1);
        calc.add(2);
        calc.add(3);
        calc.add(-2);
        calc.add(5);
        calc.add(6);
        calc.add(7);
        calc.add(-7);
        calc.add(-6);
        calc.add(-5);
        calc.add(-1);

        int result = calc.getCount();

        assertEquals(result, 0);
    }

}