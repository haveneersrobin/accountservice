package be.ae.services.model;

import lombok.Data;

import java.util.Currency;

@Data
public class MoneyAmount {
    private Float amount;
    private Currency currency;
}
