package ru.resource.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Resource on 14.11.2015.
 */

@Configuration
@Import({SecurityConfiguration.class})
@ImportResource({
        "classpath:/security.xml"
})
@ComponentScan({
        "ru.resource.app.domain.repositories",
        "ru.resource.app.domain.services"
})
public class RootConfiguration {

}
