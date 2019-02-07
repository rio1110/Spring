package com.playground.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserInfoService implements UserDetailsService{

    private UserInfoRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // Null/Blank check
        if (StringUtils.isEmpty(username))
        {
            throw new UsernameNotFoundException("");
        }

        // UserName matching
        UserInfoEntity entity = repository.findByUsername(username);

        // entity null check
        if (entity == null)
        {
            throw new UsernameNotFoundException("");
        }

        return entity;
    }

    @Autowired
    public void setUserInfoRepository(UserInfoRepository repository)
    {
        this.repository = repository;
    }
}
