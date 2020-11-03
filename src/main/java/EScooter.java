public class EScooter {
    private int _priceCode;
    public static final int REGULAR = 2;
    public static final int PROFESSIONAL = 0;
    public static final int RACE = 1;

    private String _title;
    public EScooter(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    public int getPriceCode() {
        return _priceCode;
    }
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    public String getTitle (){
        return _title;
    }


}
