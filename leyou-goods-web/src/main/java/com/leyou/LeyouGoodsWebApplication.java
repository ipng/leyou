package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Enzo Cotter on 2020/4/6.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class LeyouGoodsWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGoodsWebApplication.class);
    }
}
