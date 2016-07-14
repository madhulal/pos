package com.mozanta.pos.common.exception;

/**
 *
 * Created by Madhulal M G
 */
public class MozeaNotFoundException extends Exception {

    private static final String DEFAULT_MESSAGE = "Not Found!";

    public MozeaNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    /**
     * @param message
     */
    public MozeaNotFoundException(final String message) {
        super(message);
    }
}
