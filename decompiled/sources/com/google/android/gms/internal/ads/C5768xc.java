package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5768xc extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5894yc f34946a;

    C5768xc(C5894yc c5894yc) {
        Objects.requireNonNull(c5894yc);
        this.f34946a = c5894yc;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C5894yc.class) {
            this.f34946a.d(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (C5894yc.class) {
            this.f34946a.d(null);
        }
    }
}
