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
}
