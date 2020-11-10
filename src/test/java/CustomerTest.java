import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testCustomerStatement() {
        Assertions.assertTrue(initCustomer().statement().contains("Amount owed is 5.0"));
    }


    @Test
    public void testCustomerHtmlStatement() {
        Assertions.assertTrue(initCustomer().htmlStatement().contains("<P>You owe <EM>5.0"));
    }

    private Customer initCustomer() {
        Customer customer = new Customer("customer name");
        EScooter screwDriver = new EScooter("screw driver", EScooter.PROFESSIONAL);
        EScooter hammer = new EScooter("hammer", EScooter.RACE);

        Rental screwDriverRental = new Rental(screwDriver, 1);
        Rental hammerRental = new Rental(hammer, 1);

        customer.addRental(screwDriverRental);
        customer.addRental(hammerRental);
        return customer;
    }
}

