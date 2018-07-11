package be.ae.services;

import be.ae.services.mapper.AccountMapper;
import be.ae.services.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public be.ae.rest.model.Account createAccount(be.ae.rest.model.Account account) {
        Account dataModelAccount = accountMapper.mapToDataModel(account);
        account.setId(dataModelAccount.getId());
        return account;
    }
}
