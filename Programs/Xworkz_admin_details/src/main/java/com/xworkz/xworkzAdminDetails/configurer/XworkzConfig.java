package com.xworkz.xworkzAdminDetails.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import javax.sql.DataSource;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.xworkzAdminDetails")
public class XworkzConfig {

    public XworkzConfig(){
        System.out.println("const of configurer");
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource());
        bean.setPackagesToScan("com.xworkz.xworkzAdminDetails.entity");
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return bean;

    }

    @Bean
   public DataSource dataSource(){
       DriverManagerDataSource drivermngrdatasouce=new DriverManagerDataSource();
       drivermngrdatasouce.setDriverClassName("com.mysql.cj.jdbc.Driver");
       drivermngrdatasouce.setUsername("root");
       drivermngrdatasouce.setUrl("jdbc:mysql://localhost:3306/XworkzAdminDb");
       drivermngrdatasouce.setPassword("Poornima!22");
       return drivermngrdatasouce;
   }
}
