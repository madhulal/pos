/**
 *  Copyright(c) 2016 Mozanta Technologies Private Ltd.
 *
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of Mozanta
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  contract agreement you entered into with Mozanta.
 *
 */
package com.mozanta.pos.common.controller;

import com.mozanta.pos.common.exception.MozeaNotFoundException;
import com.mozanta.pos.common.model.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * REST exception handlers defined at a global level for the application
 *
 *
 * Created by Madhulal M G
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private static final String DEFAULT_ERROR_MESSAGE = "Something Bad Happened ! Please try later";

    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<RestResponse> handleUnknownException(final Exception ex, final WebRequest request) {
        this.logger.error(ex.getMessage(), ex);
        return new ResponseEntity<>(new RestResponse(Boolean.FALSE, DEFAULT_ERROR_MESSAGE, null),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = { MozeaNotFoundException.class })
    protected ResponseEntity<RestResponse> handleNotFoundException(final MozeaNotFoundException ex,
            final WebRequest request) {
        return handleException(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<RestResponse> handleException(final String message, final HttpStatus status) {
        return new ResponseEntity<>(new RestResponse(Boolean.FALSE, message, null), status);
    }
}
