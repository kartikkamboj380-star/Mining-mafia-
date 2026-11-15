package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes2.dex */
final class U implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleApiClient f17019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoogleApiClient.OnConnectionFailedListener f17020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zak f17021d;

    public U(zak zakVar, int i10, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f17021d = zakVar;
        this.f17018a = i10;
        this.f17019b = googleApiClient;
        this.f17020c = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f17021d.zah(connectionResult, this.f17018a);
    }
}
