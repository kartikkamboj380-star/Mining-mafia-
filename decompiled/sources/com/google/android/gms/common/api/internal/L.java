package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
final class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zact f17010a;

    L(zact zactVar) {
        this.f17010a = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17010a.zah.zae(new ConnectionResult(4));
    }
}
