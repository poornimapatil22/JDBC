package com.xworkz.Kite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Kite")
public class KiteConfig {
    public KiteConfig(){
        System.out.println("const of kite config");
    }
}
