package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("Manager")
//                .password("pass")
//                .roles("Manager")
//                .and()
//                .withUser("SecondDirector")
//                .password("pass")
//                .roles("SecondDirector")
//                .and()
//                .withUser("Sales")
//                .password("pass")
//                .roles("Sales")
//                .and()
//                .withUser("Tech")
//                .password("pass")
//                .roles("Tech");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/zamdir").hasRole("Zamdir")
                .antMatchers("/sales").hasRole("Sales")
                .antMatchers("/tex").hasRole("Tex")
                .antMatchers("/manager").hasRole("Manager")
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .usersByUsernameQuery("SELECT username, password, 'true' from employees where username = ?")
                .usersByUsernameQuery("SELECT full_name, position_id, 'true' from staff where full_name = ?")
                .usersByUsernameQuery("SELECT full_name, client_number, 'true' from client where full_name = ?")
                .usersByUsernameQuery("SELECT full_name, tourist_passport_number, 'true' from tourist where full_name = ?")
                .authoritiesByUsernameQuery("SELECT full_name, position_id from staff where full_name = ?");
    }

//    @Bean
//    public PasswordEncoder encoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
}
