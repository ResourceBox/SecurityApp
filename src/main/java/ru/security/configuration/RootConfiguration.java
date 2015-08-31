package ru.security.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by d.mashkov on 31.08.2015.
 */

@Configuration
@Import(SecurityConfiguration.class)
@ComponentScan({"ru.security.domain.services"})
public class RootConfiguration {
}
