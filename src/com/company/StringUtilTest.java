package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @org.junit.jupiter.api.Test
    void lTrim() {
        String res = StringUtil.lTrim("   asd");
        assertEquals("asd",res);
    }

    @org.junit.jupiter.api.Test
    void rTrim() {
        String res = StringUtil.rTrim("asd       ");
        assertEquals("asd",res);
    }

    @org.junit.jupiter.api.Test
    void trimOnSide() {
        String res = StringUtil.trimOnSide("   2", true);
        assertEquals("2", res);
    }

    @Test
    void indexOfN() {
        int res = StringUtil.indexOfN("HoleaCelee", 'e', 3);
        assertEquals("HoleaCelee".length()-2, res);
        res = StringUtil.indexOfN("HoleaCelee", 'K', 3);
        assertEquals(-1, res);
    }

    @Test
    void infexOfNV2() {
        int res = StringUtil.indexOfNV2("John|Paul|George|Ringo", '|', 2);
        assertEquals(9, res);
        res = StringUtil.indexOfNV2("John|Paul|George|Ringo", '#', 2);
        assertEquals(-1, res);

    }

    @Test
    void trim() {
        String res = StringUtil.trim("   asd      ");
        assertEquals("asd",res);
    }

    @Test
    void rPad() {
        String res = StringUtil.rPad(":",4,'D');
        assertEquals(":DDD",res);
    }
}