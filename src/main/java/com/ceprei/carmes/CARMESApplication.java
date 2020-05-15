package com.ceprei.carmes;

import org.hswebframework.web.authorization.basic.configuration.EnableAopAuthorize;
import org.hswebframework.web.authorization.listener.event.AuthorizingHandleBeforeEvent;
import org.hswebframework.web.loggin.aop.EnableAccessLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.event.EventListener;

@SpringCloudApplication
@EnableAopAuthorize
@EnableCaching
@EnableAccessLogger
@EnableAutoConfiguration
public class CARMESApplication {

    public static void main(String[] args) {
        SpringApplication.run(CARMESApplication.class, args);
    }

    @EventListener
    public void onApplicationEvent(AuthorizingHandleBeforeEvent event) {
        /*if (event.getContext().getAuthentication().getUser().getUsername().equals("adm")) {
            event.setAllow(true);
        }*/
    }

}
