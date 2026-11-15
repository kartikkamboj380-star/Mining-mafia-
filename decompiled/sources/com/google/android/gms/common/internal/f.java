package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

/* JADX INFO: loaded from: classes2.dex */
final class f implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ OnConnectionFailedListener f17128a;

    f(OnConnectionFailedListener onConnectionFailedListener) {
        this.f17128a = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f17128a.onConnectionFailed(connectionResult);
    }
}
