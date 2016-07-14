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
package com.mozanta.pos.user.facade;

import com.mozanta.pos.user.entity.PosUser;
import com.mozanta.pos.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Madhulal M G on 14/7/16.
 */
@Component
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService service;

    @Override
    public PosUser getSessionUser() {
        return service.getSessionUser();
    }
}
