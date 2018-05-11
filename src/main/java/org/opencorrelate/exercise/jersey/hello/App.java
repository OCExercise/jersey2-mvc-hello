package org.opencorrelate.exercise.jersey.hello;

import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;
import org.opencorrelate.exercise.jersey.hello.services.HelloService;

public class App extends ResourceConfig
{

    public App()
    {
        packages(HelloService.class.getPackage().getName());

        register(JspMvcFeature.class);
        register(LoggingFeature.class);

        property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());

    }
}
