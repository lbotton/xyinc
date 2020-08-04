package br.com.botton.xyinc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
        		"/images/**",
                "/css/**",
                "/js/**",
                "/fonts/**",
                "/assets/**",
                "/vendors/**")
                .addResourceLocations(
                        "classpath:/static/app-assets/images/",
                        "classpath:/static/app-assets/css/",
                        "classpath:/static/app-assets/js/",
                        "classpath:/static/app-assets/fonts/",
                        "classpath:/static/assets/",
                        "classpath:/static/app-assets/vendors/");
    }
    
    
}
