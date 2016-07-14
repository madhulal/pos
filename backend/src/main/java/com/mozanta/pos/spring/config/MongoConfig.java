/**
 * Copyright(c) 2016 Mozanta Technologies Private Ltd.
 * <p>
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Mozanta
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * contract agreement you entered into with Mozanta.
 */
package com.mozanta.pos.spring.config;

import com.mozanta.pos.spring.audit.UsernameAuditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Madhulal M G on 14/7/16.
 */
@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.mozanta.pos.*.repository")
public class MongoConfig{

    @Bean
    public AuditorAware<String> myAuditorProvider() {
        return new UsernameAuditor();
    }
}
