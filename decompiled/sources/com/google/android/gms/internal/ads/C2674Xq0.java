package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2674Xq0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2778Zq0 f25395a;

    C2674Xq0(C2778Zq0 c2778Zq0) {
        Objects.requireNonNull(c2778Zq0);
        this.f25395a = c2778Zq0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C2778Zq0 c2778Zq0 = this.f25395a;
        synchronized (c2778Zq0) {
            c2778Zq0.e(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C2778Zq0 c2778Zq0 = this.f25395a;
        synchronized (c2778Zq0) {
            c2778Zq0.e(null);
        }
    }
}
