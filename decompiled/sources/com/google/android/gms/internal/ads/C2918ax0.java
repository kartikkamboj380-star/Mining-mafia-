package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ax0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2918ax0 extends AbstractC2738Yw0 {
    /* synthetic */ C2918ax0(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2738Yw0
    final void a(AbstractC3044bx0 abstractC3044bx0, Set set, Set set2) {
        synchronized (abstractC3044bx0) {
            try {
                if (abstractC3044bx0.f26962h == null) {
                    abstractC3044bx0.f26962h = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2738Yw0
    final int b(AbstractC3044bx0 abstractC3044bx0) {
        int i10;
        synchronized (abstractC3044bx0) {
            i10 = abstractC3044bx0.f26963i - 1;
            abstractC3044bx0.f26963i = i10;
        }
        return i10;
    }
}
