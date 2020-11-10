public class EScooter {
    private Price price;

    private String modelName;
    public EScooter(String title, Price priceType) {
        this.modelName = title;
        this.price = priceType;
    }
    public Price getPriceCode() {
        return price;
    }
    public String getModelName(){
        return modelName;
    }

}
