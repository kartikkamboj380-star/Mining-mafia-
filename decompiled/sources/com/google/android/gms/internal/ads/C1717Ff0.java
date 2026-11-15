package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1717Ff0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1769Gf0 f18811a;

    C1717Ff0(C1769Gf0 c1769Gf0) {
        Objects.requireNonNull(c1769Gf0);
        this.f18811a = c1769Gf0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f18811a.i(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f18811a.i(false);
    }
}
