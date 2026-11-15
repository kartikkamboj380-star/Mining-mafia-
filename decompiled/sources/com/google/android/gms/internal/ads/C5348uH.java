package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348uH extends AbstractC3214dJ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33763b;

    public C5348uH(Set set) {
        super(set);
        this.f33763b = false;
    }

    public final synchronized void zza() {
        if (this.f33763b) {
            return;
        }
        g1(C5222tH.f33375a);
        this.f33763b = true;
    }
}
