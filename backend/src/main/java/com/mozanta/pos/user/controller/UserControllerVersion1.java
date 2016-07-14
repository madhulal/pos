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
package com.mozanta.pos.user.controller;

import com.mozanta.pos.user.entity.PosUser;
import com.mozanta.pos.user.facade.UserFacade;
import com.mozanta.pos.common.model.RestResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Madhulal M G on 14/7/16.
 */
@RestController
@RequestMapping("/v1/users")
public class UserControllerVersion1 {

    @Autowired
    private UserFacade facade;

    @RequestMapping(value = "/sessionUser", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<RestResponse> getCurrentUser() {
        return new ResponseEntity<>(new RestResponse(Boolean.TRUE, StringUtils.EMPTY, facade.getSessionUser()),
                HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public PosUser createUser() {
        //return facade.createUser();
        return null;
    }

}
