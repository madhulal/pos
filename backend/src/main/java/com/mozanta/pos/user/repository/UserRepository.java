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
package com.mozanta.pos.user.repository;

import com.mozanta.pos.user.entity.PosUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Madhulal M G on 10/7/16.
 */
public interface UserRepository extends MongoRepository<PosUser, ObjectId>{
    /**
     *
     * @param username
     * @return
     */
    PosUser findByUsername(String username);
}
