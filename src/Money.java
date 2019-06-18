package Examples;

public class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        if(currency == "USD") throw new IllegalArgumentException();
        fAmount = amount;
        fCurrency = currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    public Money add(Money m) {
        return new Money(amount() + m.amount(), currency());
    }

    public boolean equals(Object anObject) {
        if (anObject instanceof Money) {
            Money aMoney = (Money) anObject;
            return aMoney.currency().equals(currency()) && aMoney.amount() == amount();
        }
        return false;
    }
}
