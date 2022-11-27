package com.wcq.admin.service;

import com.wcq.admin.AccountMapper;
import com.wcq.admin.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAccById(Integer id ){
        Account account = accountMapper.getAccount(id);
        return account;
    }


}
