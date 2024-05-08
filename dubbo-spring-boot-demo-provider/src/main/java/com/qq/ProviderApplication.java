package com.qq;

/**
 * @description:
 * @author: rise
 * @date: 2024-05-09 00:07
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
