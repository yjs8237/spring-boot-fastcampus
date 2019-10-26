package kr.co.fastcampus.fcstudy.account.repository;

import kr.co.fastcampus.fcstudy.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountRepository  {

    List<Account> list();

    Account findById(Long id);

    void createAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Long id);

}
