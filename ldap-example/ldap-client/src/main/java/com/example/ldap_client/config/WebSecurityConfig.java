package com.example.ldap_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.ldap.core.ContextSource;
//import org.springframework.ldap.core.support.BaseLdapPathContextSource;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.ldap.LdapBindAuthenticationManagerFactory;
//import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
//import org.springframework.security.ldap.userdetails.PersonContextMapper;
//import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class WebSecurityConfig {

  //@Bean  
  //public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
  //  http
  //      .authorizeHttpRequests((authorize) -> authorize
  //          .requestMatchers("/", "/index.html", "/resources/**", "/error").permitAll()
  //          .anyRequest().authenticated())
  //      .formLogin(Customizer.withDefaults())
  //      .logout((logout) -> logout.logoutSuccessUrl("/"));
  //
  //  return http.build();
  //}

  //@Bean
  //ContextSource contextSource() {
  //  return new DefaultSpringSecurityContextSource("ldap://localhost:10389/dc=example,dc=org");
  //}

  //@Bean
  //AuthenticationManager ldapAuthenticationManager(BaseLdapPathContextSource contextSource) {
  //  LdapBindAuthenticationManagerFactory factory = new LdapBindAuthenticationManagerFactory(contextSource);
  //  factory.setUserDnPatterns("uid={0},ou=people");
  //  factory.setUserDetailsContextMapper(new PersonContextMapper());
  //  return factory.createAuthenticationManager();
  //}

}
