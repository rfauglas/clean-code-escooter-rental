import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals= new Vector<>();

    public Customer (String name){
        _name = name;
    };
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    public String getName (){
        return _name;
    };

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//determine amounts for each line
            double thisAmount = each.getCharge();
// add frequent renter points
            frequentRenterPoints ++;
// add bonus for a two day Race rental
            if ((each.getTool().getPriceCode() == EScooter.RACE)
                    &&
                    each.getDaysRented() > 1) frequentRenterPoints ++;
//show figures
            result += "\t" + each.getTool().getTitle()+ "\t" +
            String.valueOf(thisAmount)                    + "\n";
            totalAmount += thisAmount;
        }
//add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }

}
