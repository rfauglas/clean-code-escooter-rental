public class EScooter {
    private int priceCode;
    public static final int REGULAR = 2;
    public static final int PROFESSIONAL = 0;
    public static final int RACE = 1;

    private String modelName;
    public EScooter(String title, int priceCode) {
        this.modelName = title;
        this.priceCode = priceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getModelName(){
        return modelName;
    }


}
