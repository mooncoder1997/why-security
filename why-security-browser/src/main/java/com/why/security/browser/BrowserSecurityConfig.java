package com.why.security.browser;

import com.why.security.browser.authentication.WHYAuthenticationFailHandler;
import com.why.security.browser.authentication.WHYAuthenticationSuccessHandler;
import com.why.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * ClassName: BrowserSecurityConfig
 * Description: TODO
 * Date: 2019-06-12 00:00
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private WHYAuthenticationSuccessHandler whyAuthenticationSuccessHandler;

    @Autowired
    private WHYAuthenticationFailHandler whyAuthenticationFailHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO HTTP Basic认证
        // http.httpBasic()
        // TODO HTTP表单认证
        http.formLogin()
                // TODO HTML表单登录
                // .loginPage("/why-signIn.html")
                // TODO Controller处理
                .loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form")
                .successHandler(whyAuthenticationSuccessHandler)
                .failureHandler(whyAuthenticationFailHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/authentication/require",
                        securityProperties.getBrowser().getLoginPage(),
                        "/code/image")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }
}
