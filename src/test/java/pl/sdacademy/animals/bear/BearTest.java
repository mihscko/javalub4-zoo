package pl.sdacademy.animals.bear;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {
    @Test
    void BearShouldBeAliveImmediatelyAfterCreation() {
        int weight = 3;
    Bear bear = new BlackBear(weight);
    boolean result = bear.isAlive();
    Assert.assertTrue(result);
    }

    @Test
    void BearShouldBeAliveIfItHasEatenWithinTenDays() {
        int weight = 3;
        Bear bear = new BlackBear(weight);
        boolean result = bear.isAlive();
        bear.eat();
        Assert.assertTrue(result);
    }

    @Test
    void getWeight() {
    }

}