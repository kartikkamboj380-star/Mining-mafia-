package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2391Sf implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2575Vt f23279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2443Tf f23280b;

    C2391Sf(C2443Tf c2443Tf, C2575Vt c2575Vt) {
        this.f23279a = c2575Vt;
        Objects.requireNonNull(c2443Tf);
        this.f23280b = c2443Tf;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.f23280b.f()) {
            this.f23279a.c(new RuntimeException("Connection failed."));
        }
    }
}
