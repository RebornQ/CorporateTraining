package com.mallotec.reb.corporatetraining;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan({"com.mallotec.reb.corporatetraining.dao.base", "com.mallotec.reb.corporatetraining.dao"})
@SpringBootApplication
public class CorporateTrainingApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CorporateTrainingApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CorporateTrainingApplication.class, args);
    }

}
