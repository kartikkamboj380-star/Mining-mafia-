package com.miningmafia.app.data.remote.model;

/**
 * Standardized API error returned by the backend.
 */
public class ApiError {
    public int code;
    public String message;
    public boolean retryable;

    public ApiError() {}
}
