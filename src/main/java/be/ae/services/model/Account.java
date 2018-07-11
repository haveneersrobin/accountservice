package be.ae.services.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Generated;
import lombok.Setter;

import java.util.List;

@Data
public class Account {
    @Generated
    @Setter(AccessLevel.NONE)
    private Integer id;
    private Type type;
    private String iban;
    private String label;
    private List<String> owners;
    private MoneyAmount balance;
}
