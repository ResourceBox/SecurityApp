package ru.resource.app.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Resource on 14.11.2015.
 */
public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        registerRootContext(servletContext);
        registerWebContext(servletContext);
    }

    private void registerRootContext(ServletContext context) {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfiguration.class);

        context.addListener(new ContextLoaderListener(rootContext));
    }

    private void registerWebContext(ServletContext context) {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebConfiguration.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
        ServletRegistration.Dynamic dispatcher = context.addServlet("mvc-dispatcher", dispatcherServlet);
        dispatcher.setLoadOnStartup(1);

        dispatcher.addMapping("/");
    }

}
