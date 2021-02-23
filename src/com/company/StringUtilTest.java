package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @org.junit.jupiter.api.Test
    void lTrim() {
    }

    @org.junit.jupiter.api.Test
    void rTrim() {
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
    }
}