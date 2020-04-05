package com.leyou.gateway.config;

import org.springframework.context.annotation.*;
import org.springframework.web.cors.*;
import org.springframework.web.filter.CorsFilter;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
@Configuration
public class LeyouCorsConfigration {
    @Bean
    public CorsFilter corsFilter(){
//        初始化cors配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        允许跨域的域名，如果要携带COOKIE，不能写*。*代表所以域名都可以跨越访问
        corsConfiguration.addAllowedOrigin("http://manage.leyou.com");
        corsConfiguration.addAllowedOrigin("http://www.leyou.com");
//        允许携带COOKIE
        corsConfiguration.setAllowCredentials(true);
//        带*的就代表所有的请求方法
        corsConfiguration.addAllowedMethod("*");
//        允许携带所有的头信息
        corsConfiguration.addAllowedHeader("*");
//        初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(configurationSource);

    }
}
//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy
//public class LeyouCorsConfigration {
//    public static void main(String[] args) {
//        SpringApplication.run(LeyouCorsConfigration.class);
//    }
//}
