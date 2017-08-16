package com.yury.swagger;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import io.swagger.config.SwaggerConfig;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.ReflectiveJaxrsScanner;
import io.swagger.models.Swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rest")
public class RestApplication extends Application {
}
