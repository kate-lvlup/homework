package com.example.webexample1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static final String SINGUP_ENDPOINT = "/register";
    public static final String SINGIN_ENDPOINT = "/login";
    private final UserDetailsService userDetailsService;
    private final AuthenticationHandler authenticationHandler;

    public SecurityConfig(UserDetailsService userDetailsService, AuthenticationHandler authenticationHandler) {
        this.userDetailsService = userDetailsService;
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/js/**")
                .permitAll();
        http
                .formLogin()
                .loginPage(SINGIN_ENDPOINT)
                .permitAll()
//                .defaultSuccessUrl("/");
                .successHandler(authenticationHandler);

        http
                .authorizeRequests()
                .antMatchers(SINGUP_ENDPOINT)
                .permitAll();
        http
                .authorizeRequests()
                .antMatchers("/users/**").hasAnyAuthority("ADMIN")
                .anyRequest()
                .authenticated();


        http
                .logout()
                .invalidateHttpSession(true)
                .permitAll();
    }

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web
//                .ignoring()
//                .antMatchers("/css/**", "/js/**");
//    }

    //для хеширования пароля
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    //авторизация пользователя из базы данных
    @Bean
    public AuthenticationProvider daoAuthManager() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }


    //-------------авторизация из памяти-----------------
    // public class UserService НЕ implements UserDetailsService
    //  и НЕ @Override метод-> public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    //       Код ниже не надо
    //       private final UserDetailsService userDetailsService;
    ////    public SecurityConfig(UserDetailsService userDetailsService) {
    ////        this.userDetailsService = userDetailsService;
    ////    }
    //
    // закоментировать хеширование пароля
    // убрать из RegisterController - private final PasswordEncoder passwordEncoder;
    // и в постМаппинге  user.setPassword(user.getPassword());
//    @Bean
//    public UserDetailsService users() {
//        User.UserBuilder users = User.withDefaultPasswordEncoder();
//        UserDetails user = users
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        UserDetails admin = users
//                .username("admin")
//                .password("password")
//                .roles("USER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }
}
