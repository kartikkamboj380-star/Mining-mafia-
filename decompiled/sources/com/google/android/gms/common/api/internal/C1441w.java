package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1441w extends zabw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f17087a;

    C1441w(zabe zabeVar) {
        this.f17087a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = (zabe) this.f17087a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.zai(zabeVar);
    }
}
