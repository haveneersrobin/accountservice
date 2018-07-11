package be.ae.services.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@Data
public class Account {

    @Setter(AccessLevel.NONE)
    private Integer id;
    private Type type;
    private String iban;
    private String label;
    private List<String> owners;
    private MoneyAmount balance;

    public Account() {
        this.id = new Random().nextInt(1000);
    }
}
