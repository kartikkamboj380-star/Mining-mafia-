package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f17023b;

    V(ConnectionResult connectionResult, int i10) {
        Preconditions.checkNotNull(connectionResult);
        this.f17023b = connectionResult;
        this.f17022a = i10;
    }

    final int a() {
        return this.f17022a;
    }

    final ConnectionResult b() {
        return this.f17023b;
    }
}
