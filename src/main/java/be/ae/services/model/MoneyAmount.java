package be.ae.services.model;

import java.math.BigDecimal;
import java.util.Currency;

public class MoneyAmount {
    private BigDecimal amount;
    private Currency currency;

    public MoneyAmount(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public MoneyAmount() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}