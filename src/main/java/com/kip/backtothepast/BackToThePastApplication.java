package com.kip.backtothepast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

/**
 * @author Kip
 */
@Async
@MapperScan(value = "com.kip.backtothepast.biz.dao")
@SpringBootApplication
public class BackToThePastApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackToThePastApplication.class, args);
    }

}
