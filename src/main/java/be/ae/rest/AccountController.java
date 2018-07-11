
package be.ae.rest;

import java.util.List;
import javax.validation.Valid;

import be.ae.rest.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * No description
 * (Generated with springmvc-raml-parser v.0.10.2)
 * 
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {


    /**
     * Get list of accounts
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return null; //TODO Autogenerated Method Stub. Implement me please.
    }

    /**
     * Create new account
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createAccount(
        @Valid
        @RequestBody
        Account account) {
        return null; //TODO Autogenerated Method Stub. Implement me please.
    }

    /**
     * Retrieve account details
     * 
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public Account getAccountById(
        @PathVariable
        String accountId) {
        Account dummyAccount = new Account();
        dummyAccount.setType(Account.Type.CHECKINGS);
        return dummyAccount;
    }

    /**
     * Delete account
     * 
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAccountById(
        @PathVariable
        String accountId) {
        return null; //TODO Autogenerated Method Stub. Implement me please.
    }

}
