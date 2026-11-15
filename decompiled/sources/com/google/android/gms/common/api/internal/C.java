package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ D f16987a;

    C(D d10) {
        this.f16987a = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq zabqVar = this.f16987a.f16988a;
        zabqVar.zac.disconnect(zabqVar.zac.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
