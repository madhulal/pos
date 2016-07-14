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

/**
 * @author Madhulal M G on 14/7/16.
 */
public interface UserFacade {

    PosUser getSessionUser();
}
