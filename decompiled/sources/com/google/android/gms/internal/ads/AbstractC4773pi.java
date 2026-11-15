package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4773pi {
    public static boolean a(C5780xi c5780xi, C5402ui c5402ui, String... strArr) {
        if (c5402ui == null) {
            return false;
        }
        c5780xi.b(c5402ui, G4.t.o().elapsedRealtime(), strArr);
        return true;
    }
}
