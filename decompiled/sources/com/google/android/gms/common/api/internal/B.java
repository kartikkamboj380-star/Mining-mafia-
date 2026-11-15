package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f16985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zabq f16986b;

    B(zabq zabqVar, int i10) {
        this.f16986b = zabqVar;
        this.f16985a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16986b.zaI(this.f16985a);
    }
}
