package com.huawei.tools.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.tools.bean.Account;
import com.huawei.tools.dao.AccountDao;
import com.huawei.tools.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao account;
	@Override
	public List<Account> findAll() {
		
		return account.findAll();
	}

}
