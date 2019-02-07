package com.playground.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, String>{

    public UserInfoEntity findByUsername(String username);
}
