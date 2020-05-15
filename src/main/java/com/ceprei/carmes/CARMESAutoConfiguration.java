package com.ceprei.carmes;

import org.hswebframework.web.dao.Dao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.ceprei.carmes.controller", "com.ceprei.carmes.service"})
@MapperScan(value = "com.ceprei.carmes.dao",markerInterface = Dao.class)
public class CARMESAutoConfiguration {
    //jljdfasljlfjlasjlfjkl
}
