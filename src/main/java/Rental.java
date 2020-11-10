public class Rental {
    private EScooter eScooter;
    private int daysRented;
    public Rental(EScooter tool, int daysRented) {
        eScooter = tool;
        this.daysRented = daysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public EScooter getEScooter() {
        return eScooter;
    }

    public double getCharge() {
        return eScooter.getPriceCode().getCharge(getDaysRented());
    }

    int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints ++;
// add bonus for a two day Race rental
        if ((getEScooter().getPriceCode() == Price.RACE)
                &&
                getDaysRented() > 1) frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}
