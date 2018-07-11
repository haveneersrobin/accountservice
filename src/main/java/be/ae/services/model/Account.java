package be.ae.services.model;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import lombok.Data;
import lombok.Generated;

@Data
public class Account {
    @Generated
    private Integer id;
    private Type type;
    private String iban;
    private String label;
    private Iterators.Array<String> owners;
    private MoneyAmount moneyAmount;
}
