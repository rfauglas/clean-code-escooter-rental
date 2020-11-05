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
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//determine amounts for each line
            // add frequent renter points
            frequentRenterPoints ++;
// add bonus for a two day Race rental
            if ((each.getEScooter().getPriceCode() == EScooter.RACE)
                    &&
                    each.getDaysRented() > 1) frequentRenterPoints ++;
//show figures
            result += "\t" + each.getEScooter().getTitle()+ "\t" +
            String.valueOf(each.getCharge())                    + "\n";
        }
//add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }


}
