package com.playground.login;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "USERINFO")
public class UserInfoEntity implements UserDetails{

    @Id
    @Column(name = "USERID")
    @NotBlank
    private String userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASS")
    @NotBlank
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "USERINFO" + '{' + "userid=" + this.userId + ", username=" + this.username + ", password=" + this.password + '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getPassword() {
        // TODO 自動生成されたメソッド・スタブ
        return this.password;
    }

    @Override
    public String getUsername() {
        // TODO 自動生成されたメソッド・スタブ
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }
}
