import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RewardValueTests {
    @Test
    void testCashToMilesConversion() {
        double cashValue = 100.0;
        RewardValue reward = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035;
        assertEquals(expectedMiles, reward.getMilesValue(), 0.001);
    }

    @Test
    void testMilesToCashConversion() {
        int milesValue = 1000;
        RewardValue reward = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(expectedCash, reward.getCashValue(), 0.001);
    }

    @Test
    void testGetCashValue() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0, reward.getCashValue());
    }

    @Test
    void testGetMilesValue() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(100.0 / 0.0035, reward.getMilesValue(), 0.001);
    }
}