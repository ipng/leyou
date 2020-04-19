package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by Enzo Cotter on 2020/4/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.leyou.user.mapper")
public class LeyouUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeyouUserApplication.class, args);
    }
}
