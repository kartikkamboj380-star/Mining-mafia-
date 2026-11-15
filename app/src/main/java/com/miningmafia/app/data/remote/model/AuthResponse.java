package com.miningmafia.app.data.remote.model;

/**
 * Authentication response from the authorized backend.
 */
public class AuthResponse {
    public String token;
    public String refreshToken;
    public String userId;
    public String email;
    public boolean emailVerified;
    public String provider; // "google" or "email"

    public AuthResponse() {}
}
