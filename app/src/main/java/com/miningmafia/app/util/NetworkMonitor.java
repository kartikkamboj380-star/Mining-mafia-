package com.miningmafia.app.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/**
 * Monitors network connectivity so mining and sync can pause on interruption
 * and resume when the network returns.
 */
public class NetworkMonitor {

    public interface Callback {
        void onNetworkChanged(boolean connected);
    }

    private final Context context;
    private Callback callback;
    private boolean connected = false;

    public NetworkMonitor(Context context) {
        this.context = context.getApplicationContext();
        refresh();
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
        if (callback != null) {
            callback.onNetworkChanged(connected);
        }
    }

    public void refresh() {
        ConnectivityManager cm = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean result = false;
        if (cm != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                NetworkCapabilities caps = cm.getNetworkCapabilities(cm.getActiveNetwork());
                result = caps != null
                        && (caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                        || caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
                        || caps.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
                        || caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN));
            } else {
                result = cm.getActiveNetworkInfo() != null
                        && cm.getActiveNetworkInfo().isConnectedOrConnecting();
            }
        }
        connected = result;
        if (callback != null) {
            callback.onNetworkChanged(connected);
        }
    }

    public boolean isConnected() { return connected; }
}
