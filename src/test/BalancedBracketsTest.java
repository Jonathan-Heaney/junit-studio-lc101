package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsWithStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[String]"));
    }
    @Test
    public void bracketsWithStringFirstReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("String[]"));
    }

    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void closedBracketFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void closedBracketFirstInSecondSetReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[] ]["));
    }

    @Test
    public void closedBracketFirstWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void balancedWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[7%998/}{+]@#"));
    }

    @Test
    public void manyBracketsLastMisnestedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[ ]]]] []["));
    }

    @Test
    public void lotsOfCorrectBracketsLastWrongReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[String] [String] [String] [String] [String] ]String["));
    }


}
