package be.ae.services;

import be.ae.rest.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account createAccount(Account account) {
        return new Account();
    }
}
