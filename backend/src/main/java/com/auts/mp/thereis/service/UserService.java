package com.auts.mp.thereis.service;

import com.auts.mp.thereis.model.dao.AccountModel;

public interface UserService {

	AccountModel queryLoginUser(String username, String password);

}