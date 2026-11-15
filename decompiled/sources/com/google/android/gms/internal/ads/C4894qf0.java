package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4894qf0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5145sf0 f32702a;

    C4894qf0(C5145sf0 c5145sf0) {
        Objects.requireNonNull(c5145sf0);
        this.f32702a = c5145sf0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f32702a.k(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f32702a.k(false);
    }
}
