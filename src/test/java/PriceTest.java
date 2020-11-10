import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {

    @Test
    public void priceTypeDuration() {
        testPrice(Price.PROFESSIONAL, 2, 2.0);
        testPrice(Price.PROFESSIONAL, 3, 3.5);
        testPrice(Price.REGULAR, 3, 1.5);
        testPrice(Price.REGULAR, 4, 3.0);
        testPrice(Price.RACE, 1, 3);
        testPrice(Price.RACE, 2, 6.0);
    }


    private void testPrice(Price price, int daysRented, double expected) {
        assertEquals(expected, price.getCharge(daysRented));
    }
}