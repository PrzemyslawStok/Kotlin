package com.example.SimpleSeciurity

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

class WebSecuring : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        /*http?.let {
            it.authorizeRequests().antMatchers("/","home").permitAll()
                .anyRequest().authenticated().and().formLogin().
                loginPage("login").permitAll().and().logout().permitAll()
        }*/
    }
}
