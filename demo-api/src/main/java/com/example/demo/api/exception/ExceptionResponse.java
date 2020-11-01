package com.example.demo.api.exception;

import java.net.URI;

public class ExceptionResponse {
    private final int statusCode;
    private final String reasonPhrase;
    private final URI path;
    private final String message;

    public ExceptionResponse(int statusCode, String reasonPhrase, URI path, String message) {
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        this.path = path;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public URI getPath() {
        return path;
    }

    public String getMessage() {
        return message;
    }
}
