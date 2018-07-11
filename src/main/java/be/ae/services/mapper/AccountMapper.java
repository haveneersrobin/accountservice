package be.ae.services.mapper;

import be.ae.services.model.Account;
import be.ae.services.model.MoneyAmount;
import be.ae.services.model.Type;
import org.springframework.stereotype.Service;

import java.util.Currency;

@Service
public class AccountMapper {
    public Account mapToDataModel(be.ae.rest.model.Account representation) {
        Account model = new Account();
        model.setLabel(representation.getLabel());
        model.setIban(representation.getIban());
        model.setOwners(representation.getOwners());
        model.setType(mapType(representation.getType()));
        model.setBalance(mapMoneyAmount(representation.getMoneyAmount()));
        return model;
    }

    private MoneyAmount mapMoneyAmount(be.ae.rest.model.MoneyAmount moneyAmount) {
        MoneyAmount model = new MoneyAmount();
        model.setAmount(moneyAmount.getAmount());
        model.setCurrency(Currency.getInstance(moneyAmount.getCurrency()));
        return model;
    }

    private Type mapType(be.ae.rest.model.Account.Type type) {
        switch(type){
            case SAVINGS:
                return Type.SAVING;
            case CHECKINGS:
                return Type.CHECKINGS;
            default:
                return Type.CHECKINGS;
        }
    }
}
