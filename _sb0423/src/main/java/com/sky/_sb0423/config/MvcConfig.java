package com.sky._sb0423.config;

import com.sky._sb0423.interceptor.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc << 이거 쓰면 스프링부트 작동 오류 생길 가능성 매우 높음
public class MvcConfig implements WebMvcConfigurer { //인터셉터 등의 기능을 쓸때 필수
    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // 처음 켜지면 main이라는 뷰로 가라
        registry.addViewController("/").setViewName("main");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoggerInterceptor())
                .addPathPatterns("/register/**")
                .excludePathPatterns("/practice/**");

    }
}
