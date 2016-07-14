/**
 * Copyright(c) 2016 Mozanta Technologies Private Ltd.
 * <p/>
 * All rights reserved.
 * <p/>
 * This software is the confidential and proprietary information of Mozanta
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * contract agreement you entered into with Mozanta.
 */
package com.mozanta.pos.user.entity;

import java.util.Set;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Madhulal M G on 10/7/16.
 */
@Document(collection = "users")
@Data
public class PosUser {

    private String username;

    private String password;

    private Set<String> roles;

    private boolean locked;

    private boolean expired;

    private boolean enabled;
}
