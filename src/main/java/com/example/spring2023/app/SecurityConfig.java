package com.example.spring2023.app;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Класс отвечает за настройку безопасности в приложении
 * */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * Метод отвечает за установление уровней доступа
     * */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("userpassword")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("adminpassword")
                .roles("ADMIN");
    }

    /**
     * Метод отвечает за авторизацию пользователей по уровню доступа
     * */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/registeredUsers").hasAnyRole("USER", "ADMIN")
                .antMatchers("/allUsers").permitAll()
                .and().formLogin();
    }

    /**
     * Метод отвечает за создание создание объекта PasswordEncoder для шифрования паролей пользователей
     * */
    @Bean
    public PasswordEncoder encoder(){
        return NoOpPasswordEncoder.getInstance(); //return passwordEncoder(добавить new)
    }


}
