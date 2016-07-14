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

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Madhulal M G on 14/7/16.
 */
@Configuration
@ComponentScan(basePackages = {"com.mozanta.pos.*.service", "com.mozanta.pos.*.controller", "com.mozanta.pos.*.facade"})
@Import({SwaggerConfig.class,MongoConfig.class})
public class ApplicationConfig {
}
