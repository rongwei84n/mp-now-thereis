package com.auts.mp.thereis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auts.mp.thereis.dao.AccountMapper;
import com.auts.mp.thereis.model.dao.AccountModel;
import com.auts.mp.thereis.service.UserService;
import com.auts.mp.thereis.util.EntryUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	AccountMapper userMapper;

	@Override
	public AccountModel queryLoginUser(String username, String password) {
		return userMapper.login(username, EntryUtils.getMd5(password));
	}

}