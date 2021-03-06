package com.auts.mp.thereis.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.auts.mp.thereis.model.dao.AccountModel;

public interface UserMapper {

	@Select("select * from tbl_user where user_name=#{userName} and passwd=#{pwd} and status=0 limit 1")
    AccountModel queryLoginUser(@Param("userName") String username, @Param("pwd") String password);

}