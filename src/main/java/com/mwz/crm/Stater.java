package com.mwz.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: yuuki
 * @Date: 2021-04-05 - 04 - 15:59
 * @Description: com.mwz.crm
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.mwz.crm.dao")
public class Stater {
    public static void main(String[] args) {
        SpringApplication.run(Stater.class);
    }
}
