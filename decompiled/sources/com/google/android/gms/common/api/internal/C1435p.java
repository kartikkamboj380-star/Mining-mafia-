package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1435p implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zaaw f17075a;

    /* synthetic */ C1435p(zaaw zaawVar, zaas zaasVar) {
        this.f17075a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ((p156p5.e) Preconditions.checkNotNull(this.f17075a.zak)).a(new BinderC1434o(this.f17075a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f17075a.zab.lock();
        try {
            if (this.f17075a.zaI(connectionResult)) {
                this.f17075a.zaA();
                this.f17075a.zaF();
            } else {
                this.f17075a.zaD(connectionResult);
            }
        } finally {
            this.f17075a.zab.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
