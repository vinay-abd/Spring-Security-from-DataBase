package com.example.demo.Security_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(getPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("**/secure/**").authenticated()
		.anyRequest()
		.fullyAuthenticated()
		.and().formLogin()
		.and().httpBasic();
		http.csrf().disable();
	}

	public PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder() {

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				return rawPassword.toString();
			}
		};
	}
}