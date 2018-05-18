package com.auts.mp.thereis.service;

import com.auts.mp.thereis.model.dao.TokenModel;


public interface TokenService {

    TokenModel getByUid(String uid);

    TokenModel getByToken(String token);

    int insertToken(TokenModel model);

    int updateToken(TokenModel model);
}
