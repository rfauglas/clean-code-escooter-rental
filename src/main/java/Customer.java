import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer (String name){
        this.name = name;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }
    public String getName (){
        return name;
    };



    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
//show figures
            result += "\t" + each.getEScooter().getModelName()+ "\t" +
            String.valueOf(each.getCharge())                    + "\n";
        }
//add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) +
                "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
                +
                " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration rentals = this.rentals.elements();
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></ H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += each.getEScooter().getModelName()+ ": " +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
//add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) +
                "</EM><P>\n";
        result += "On this rental you earned <EM>" +
                String.valueOf(getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

}
