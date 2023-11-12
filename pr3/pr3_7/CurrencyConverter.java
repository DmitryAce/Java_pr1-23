package pr3.pr3_7;

class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}