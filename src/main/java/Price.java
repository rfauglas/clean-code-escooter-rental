public enum Price implements Chargeable {
    PROFESSIONAL {
        @Override
        public double getCharge(int daysRented) {
            double thisAmount = 2;
            if (daysRented > 2)
                thisAmount += (daysRented - 2) * 1.5;
            return thisAmount;
        }
    },
    RACE {
        @Override
        public double getCharge(int daysRented) {
            double thisAmount = daysRented * 3;
            return thisAmount;
        }
    },
    REGULAR {
        @Override
        public double getCharge(int daysRented) {
            double thisAmount = 1.5;
            if (daysRented > 3)
                thisAmount += (daysRented - 3) * 1.5;
            return thisAmount;
        }
    };

    public int getPriceCode() {
        return this.ordinal();
    }

}