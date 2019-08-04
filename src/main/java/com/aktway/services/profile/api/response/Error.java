package com.aktway.services.profile.api.response;

public class Error {

    private int errorCode;
    private String message;

    @Override
    public String toString() {
        return
                "Error{ " +
                        "errorCode=" + errorCode +
                        ", message=" + message +
                        '}';
    }

}
