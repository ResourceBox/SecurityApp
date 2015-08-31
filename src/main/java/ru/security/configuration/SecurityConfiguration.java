package ru.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import ru.security.security.CustomAuthenticationProvider;

/**
 * Created by d.mashkov on 31.08.2015.
 */

@Configuration
@ImportResource("classpath:/security.xml")
@ComponentScan({"ru.security.security"})
public class SecurityConfiguration {
}
