package org.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BlogMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogMainApplication.class,args);
    }
}