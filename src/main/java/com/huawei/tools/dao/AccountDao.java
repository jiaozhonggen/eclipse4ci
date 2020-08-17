package com.huawei.tools.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.huawei.tools.bean.Account;
@Mapper
public interface AccountDao {
	List<Account>findAll();
}
