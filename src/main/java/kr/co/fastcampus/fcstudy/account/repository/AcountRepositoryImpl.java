package kr.co.fastcampus.fcstudy.account.repository;

import kr.co.fastcampus.fcstudy.account.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Repository
public class AcountRepositoryImpl implements AccountRepository {

    List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> list() {
        return accountList;
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void createAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Long id) {

    }
}
