package com.huawei.tools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.tools.bean.Account;
import com.huawei.tools.service.AccountService;

@Controller
public class MainController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Account> list(){
		return accountService.findAll();
	}
	
}
