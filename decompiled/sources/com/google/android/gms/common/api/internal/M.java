package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f17011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zact f17012b;

    M(zact zactVar, com.google.android.gms.signin.internal.l lVar) {
        this.f17012b = zactVar;
        this.f17011a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.f17012b, this.f17011a);
    }
}
