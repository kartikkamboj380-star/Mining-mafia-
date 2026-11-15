package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC1434o extends com.google.android.gms.signin.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f17074a;

    BinderC1434o(zaaw zaawVar) {
        this.f17074a = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.f
    public final void zab(com.google.android.gms.signin.internal.l lVar) {
        zaaw zaawVar = (zaaw) this.f17074a.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.zaa.zal(new C1433n(this, zaawVar, zaawVar, lVar));
    }
}
