package sample.spring.chapter11.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.spring.chapter11.bankapp.domain.BankAccountDetails;
import sample.spring.chapter11.bankapp.service.BankAccountService;

import java.util.Date;

@RestController
public class Controller {

    @Autowired
    BankAccountService bankAccountService;


    @RequestMapping("/test")
    public void test()
    {
        BankAccountDetails bankAccountDetails = new BankAccountDetails();

        bankAccountDetails.setBalanceAmount(1000);
        bankAccountDetails.setLastTransactionTimestamp(new Date());

        bankAccountService.createBankAccount(bankAccountDetails);
    }
}
