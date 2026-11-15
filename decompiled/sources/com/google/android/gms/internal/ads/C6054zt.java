package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6054zt extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1588Ct f35871a;

    C6054zt(C1588Ct c1588Ct) {
        Objects.requireNonNull(c1588Ct);
        this.f35871a = c1588Ct;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f35871a.c().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f35871a.c().set(false);
    }
}
