package com.hcd.mappedinterceptor.config;

import com.hcd.mappedinterceptor.interceptor.AppInterceptor;
import com.hcd.mappedinterceptor.interceptor.SessionInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

@EnableWebMvc
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final AppInterceptor appInterceptor;
    private final SessionInterceptor sessionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(appInterceptor);
        registry.addInterceptor(new MappedInterceptor(null, new String[] {"/api/**"}, sessionInterceptor));
    }
}
