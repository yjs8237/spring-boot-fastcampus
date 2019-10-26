package kr.co.fastcampus.fcstudy.account.controller;

import kr.co.fastcampus.fcstudy.account.domain.Account;
import kr.co.fastcampus.fcstudy.account.service.AccountService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class AccountController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public ModelAndView account(Map<String, Object> model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("account/list");
        List<Account> accountList = accountService.getAccountList();

        modelAndView.addObject("accounts" , accountList);


        return modelAndView;
    }

    @PostMapping("/account")
    @ResponseBody
    public Account create(@RequestBody Account account) {


        log.info("username : " + account.getUsername());
        log.info("password : " + account.getPassword());
        System.out.println("username : " + account.getUsername());
        System.out.println("password : " + account.getPassword());

        accountService.createAccount(account);

        return account;
    }

}
