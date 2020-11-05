public class Rental {
    private EScooter eScooter;
    private int _daysRented;
    public Rental(EScooter tool, int daysRented) {
        eScooter = tool;
        _daysRented = daysRented;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public EScooter getEScooter() {
        return eScooter;
    }

    public double getCharge() {
        double thisAmount = 0;
        switch (getEScooter().getPriceCode()) {
            case EScooter.PROFESSIONAL:
                thisAmount += 2;
                if (getDaysRented() > 2)
                    thisAmount += (getDaysRented() - 2) * 1.5;
                break;
            case EScooter.RACE:
                thisAmount += getDaysRented() * 3;
                break;
            case EScooter.REGULAR:
                thisAmount += 1.5;
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        frequentRenterPoints ++;
// add bonus for a two day Race rental
        if ((getEScooter().getPriceCode() == EScooter.RACE)
                &&
                getDaysRented() > 1) frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}
