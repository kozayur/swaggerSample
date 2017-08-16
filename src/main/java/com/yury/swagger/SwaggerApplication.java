package com.yury.swagger;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/v2")
public class SwaggerApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();

        // Swagger Resources
        resources.add(MyApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        return resources;
    }

    @Bean
    public BeanConfig getSwaggerBeanConfig() {

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setScan(true);
        beanConfig.setBasePath("/rest");
        beanConfig.setResourcePackage(this.getClass().getPackage().getName());
        return beanConfig;
    }
}
