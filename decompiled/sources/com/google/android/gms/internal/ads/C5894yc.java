package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5894yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f35420a;

    C5894yc(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C5768xc(this));
            } catch (RuntimeException unused) {
                synchronized (C5894yc.class) {
                    this.f35420a = null;
                }
            }
        }
    }

    public static C5894yc a(Context context) {
        if (context != null) {
            return new C5894yc((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities b() {
        return this.f35420a;
    }

    public final long c() {
        synchronized (C5894yc.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f35420a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f35420a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f35420a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void d(NetworkCapabilities networkCapabilities) {
        this.f35420a = networkCapabilities;
    }
}
