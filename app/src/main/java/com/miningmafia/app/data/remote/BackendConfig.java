package com.miningmafia.app.data.remote;

import android.content.Context;
import com.miningmafia.app.util.EncryptedPrefs;

/**
 * Backend configuration.
 *
 * IMPORTANT: The actual CT Pool backend URL and any provider credentials must be supplied
 * by the user. This repository does NOT contain API secrets, signing keys, or provider
 * credentials. The backend stays where it is (on the user's side); this app merely connects
 * to it via a configurable base URL.
 *
 * Set the backend base URL through the Settings screen or via encrypted preferences.
 * Defaults to a placeholder that will fail clearly until configured.
 */
public class BackendConfig {

    public static final String DEFAULT_BASE_URL = "https://your-ctpool-backend.example.com/api/";
    private static final String KEY_BASE_URL = "backend_base_url";

    private final Context context;
    private final EncryptedPrefs encryptedPrefs;

    public BackendConfig(EncryptedPrefs encryptedPrefs) {
        this.context = null;
        this.encryptedPrefs = encryptedPrefs;
    }

    public String getBaseUrl() {
        String url = encryptedPrefs.getString(KEY_BASE_URL, null);
        if (url == null || url.isEmpty()) {
            return DEFAULT_BASE_URL;
        }
        return url;
    }

    public void setBaseUrl(String baseUrl) {
        encryptedPrefs.putString(KEY_BASE_URL, baseUrl);
    }

    public boolean isConfigured() {
        String url = encryptedPrefs.getString(KEY_BASE_URL, null);
        return url != null && !url.isEmpty() && !url.equals(DEFAULT_BASE_URL);
    }
}
