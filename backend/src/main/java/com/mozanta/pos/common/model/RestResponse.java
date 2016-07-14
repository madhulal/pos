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
package com.mozanta.pos.common.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Madhulal M G on 14/7/16.
 */
@Data
@AllArgsConstructor
public class RestResponse implements Serializable {

    private Boolean success;

    private List<String> messages;

    private Object data;

    /**
     * @param success
     * @param message
     * @param data
     */
    public RestResponse(final Boolean success, final String message, final Object data) {
        this(success, createMessages(message), data);
    }

    private static List<String> createMessages(final String message) {
        List<String> messages = null;
        if (StringUtils.isNotBlank(message)) {
            messages = new ArrayList<>();
            messages.add(message);
        }
        return messages;
    }
}
