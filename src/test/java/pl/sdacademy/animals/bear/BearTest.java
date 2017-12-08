package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pl.sdacademy.animals.time.Clock;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {
    @Test
    void BearShouldBeAliveImmediatelyAfterCreation() {
        int weight = 3;
        Bear bear = new BlackBear(weight);
        assertTrue(bear.isAlive());
    }

    @Test
    void BearShouldBeAliveIfItHasEatenWithinTenDays() {
        int weight = 3;
        Bear bear = new BlackBear(weight);
        boolean result = bear.isAlive();
        bear.eat();
        assertTrue(bear.isAlive());
    }

    @Test
    void BearShouldNotBeAliveIfItHasEatenWithinMoreThanTenDays() {
        int weight = 3;
        TestClock clock = new TestClock();
        Bear bear = new BlackBear(weight, clock);
        bear.eat();
        clock.changeTimeByDays(10);
        boolean result = bear.isAlive();

        Assert.assertTrue(result == false);

    }

    class TestClock implements Clock {

        private DateTime time = DateTime.now();

        @Override
        public DateTime getCurrentTime() {
            return time;
        }

        public void changeTimeByDays(int days) {
            time = time.plusDays(days);
        }
    }
}