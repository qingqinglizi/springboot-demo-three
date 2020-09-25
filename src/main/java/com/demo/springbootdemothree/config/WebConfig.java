package com.demo.springbootdemothree.config;

import acc.AuthFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: Lee
 * @Date 2020/6/19 16:16
 * @Description:
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${acc.service}")
    private String accServiceUrl;

    @Value("${acc.login}")
    private String accLoginUrl;

    @Bean
    public FilterRegistrationBean timeFilter() {

        // 过滤器注册器
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        // 第三方过滤器
        AuthFilter authFilter = new AuthFilter("我叫过滤器", "UTF-8", accLoginUrl, accServiceUrl);
        registrationBean.setFilter(authFilter);

//        // 过滤路径
//        List<String> urls = new ArrayList<>();
//        urls.add("/*");
//        registrationBean.setUrlPatterns(urls);

        return registrationBean;

    }
}
