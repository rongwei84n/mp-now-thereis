package com.auts.mp.thereis.service;

import java.util.List;
import java.util.Map;

import com.auts.mp.thereis.model.common.PageInfo;
import com.auts.mp.thereis.model.dao.FinancerModel;

public interface FinancerService {
	PageInfo queryFinancerList(String nameSearch, int pageNumber, int pageSize);

	void addFinancer(FinancerModel financer);

	void delFinancer(String uid);

	void btrvFinancer(String uids);

	void editFinancer(FinancerModel financer);

	List<Map<String, Object>> queryFinaAsync();

	void handleSwitch(String uid);
}