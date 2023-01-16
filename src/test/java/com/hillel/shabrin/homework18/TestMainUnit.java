package com.hillel.shabrin.homework18;

import com.hillel.shabrin.homework.homework18.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMainUnit {


    static int[] arrayTest;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All:");
        arrayTest = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void test1() {
        double value = Main.getAverageValue(new int[]{});
        assertEquals(0.0, value);
    }

    @Test
    public void test3() {
        double value = Main.getAverageValue(null);
        assertEquals(0.0, value);
    }

    @Test
    public void test4() {
        double value = Main.getAverageValue(arrayTest);
        assertEquals(15.0, value);
    }

    @Test
    public void test5(){
        assertTrue(Main.isSquare(new int[5][5]));
    }

    @Test
    public void test6(){
        assertFalse(Main.isSquare(new int[2][3]));
    }
}