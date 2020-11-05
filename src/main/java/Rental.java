public class Rental {
    private EScooter _tool;
    private int _daysRented;
    public Rental(EScooter tool, int daysRented) {
        _tool = tool;
        _daysRented = daysRented;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public EScooter getTool() {
        return _tool;
    }

    public double getCharge() {
        double thisAmount = 0;
        switch (getTool().getPriceCode()) {
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
}
