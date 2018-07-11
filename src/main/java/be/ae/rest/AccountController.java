package be.ae.rest;

import be.ae.rest.model.Account;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.ArrayList;


/**
 * No description
 * (Generated with springmvc-raml-parser v.0.9.1)
 *
 */
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    /**
     * Get list of accounts
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<?>> getAccounts() {
        return ResponseEntity.ok(new ArrayList<Account>());
    }

    /**
     * Create new accounts
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createAccount(@Valid @RequestBody Account account) {
		String id = "myId";
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(location).build();
    }

    /**
     * Retrieve account details
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> getAccountById(@PathVariable String accountId) {
        return ResponseEntity.ok(new Account());
    }

    /**
     * Delete account
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteAccountById(@PathVariable String accountId) {
        return ResponseEntity.noContent().build();
    }
}