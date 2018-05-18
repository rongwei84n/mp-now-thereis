package com.auts.mp.thereis.service;

import com.auts.mp.thereis.model.common.PageInfo;
import com.auts.mp.thereis.model.dao.CustomerModel;

public interface CustomerService {

	void addCustomer(CustomerModel customer);

	PageInfo queryCustomerList(String nameSearch, int pageNumber, int pageSize);

	void editCustomer(CustomerModel financer);

	void delCustomer(String uid);

	void btrvCustomer(String uids);

	void handleCancel(String uid);

	void handleNormal(String uid);

	void handleSwitch(String uid);

}
