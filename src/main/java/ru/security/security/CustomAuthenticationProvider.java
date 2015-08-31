package ru.security.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by d.mashkov on 31.08.2015.
 */

@Component("CustomAuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;

        User user = new User();
        user.setLogin(token.getCredentials().toString());
        user.setPassword(token.getPrincipal().toString());
        user.setName(token.getName().toString());

        Collection<? extends GrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority("BURGER"));

        return new UsernamePasswordAuthenticationToken(user, user.getPassword(), authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return UsernamePasswordAuthenticationToken.class == aClass;
    }
}
