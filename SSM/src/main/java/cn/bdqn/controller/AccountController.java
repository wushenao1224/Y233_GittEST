package cn.bdqn.controller;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/zheng")
    @ResponseBody
    public List<Account> zhenghe(){
        return accountService.queryAll();
    }
}
