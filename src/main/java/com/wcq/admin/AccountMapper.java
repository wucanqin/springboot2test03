package com.wcq.admin;

import com.wcq.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    public Account getAccount(Integer id);



}
