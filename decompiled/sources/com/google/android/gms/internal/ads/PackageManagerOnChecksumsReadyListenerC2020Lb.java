package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class PackageManagerOnChecksumsReadyListenerC2020Lb implements PackageManager$OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2376Rx0 f20555a = C2376Rx0.B();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f20555a.k("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = AbstractC1864Ib.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    C2376Rx0 c2376Rx0 = this.f20555a;
                    AbstractC2528Uv0 abstractC2528Uv0G = AbstractC2528Uv0.l().g();
                    byte[] value = apkChecksumA.getValue();
                    c2376Rx0.k(abstractC2528Uv0G.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f20555a.k("");
    }
}
