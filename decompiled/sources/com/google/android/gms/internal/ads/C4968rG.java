package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4968rG extends AbstractC3214dJ {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32866b;

    public C4968rG(Set set) {
        super(set);
        this.f32866b = false;
    }

    public final synchronized void zza() {
        if (this.f32866b) {
            return;
        }
        g1(C4843qG.f32606a);
        this.f32866b = true;
    }
}
