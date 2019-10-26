package kr.co.fastcampus.fcstudy.account.service;

import kr.co.fastcampus.fcstudy.account.domain.Account;
import kr.co.fastcampus.fcstudy.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public List<Account> getAccountList() {
        return accountRepository.list();
    }

    @Transactional
    public void createAccount(Account account) {
        accountRepository.createAccount(account);
    }


}
