package org.example.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.Enums.AccountType;

public class Account {

    private String firstName;
    private String lastName;
    private String id;
    private String password;
    private AccountType accountType;

    public Account() {
    }

    public void resetPassword(String newPassword){
        this.password = newPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Account(String firstName, String lastName, String id, String password, AccountType accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.password = password;
        this.accountType = accountType;
    }
}